package testNG_Annotations;

//this program is to demonstrate beforetest & aftertest method

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterAnnotations {
	
	WebDriver driver; 
	@BeforeTest
	public void launch() {
		// Launch the broswer
		System.out.println("this is before test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  // naviagte to the URL
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@Test(priority=1)
	public void login(){
		// To enter the Username and password and click on submit button
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();	
	}
	
	@Test(priority=2)
	public void logout() throws InterruptedException{
		// To click on welcome and logout link
		Thread.sleep(6000);
		  driver.findElement(By.id("welcome")).click();
		  Thread.sleep(6000);
		  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	}
	
	@AfterTest
	public void close(){
		//To close the browser
		driver.quit();
	}
}
