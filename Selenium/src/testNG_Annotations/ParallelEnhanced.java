package testNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelEnhanced {
	
	public WebDriver driver;
	
	@Parameters("mybrowser")
	@BeforeTest
	public void launch(String mybrowser){
		if (mybrowser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver-v0.22.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}else if (mybrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
	}
	
	@Test
	public void Google(){
		// To open google URL
		driver.get("http://www.google.co.in");
		// In the search i am passing selenium
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	}

}
