package testNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  // To entering the username and password
	  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(n);
	  driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(s);
	  driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.id("welcome")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	  
  }

  @DataProvider
  public Object[][] dp() {
	  // To fetch the value to @Test method
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123"},
    };
  }
  @BeforeTest
  public void beforeTest() {
	  // To launch and open the URL
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  // To close
	  driver.quit();
  }

}
