package testNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class DependsOnMethod {

	WebDriver driver;
	
	@Test
	public void launch(){
		// To open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  // To launch the URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(dependsOnMethods={"launch"})
		public void m(){
		// To enter username, password and click login button
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();	
		
	}
	@Test(dependsOnMethods={"m"})
	public void n()
	{
		driver.close();
	}
}
