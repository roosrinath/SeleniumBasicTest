package BasicSeleniumTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.Utility;

public class TakeScreenShotUtility {
	
	WebDriver driver;
	
	@Test
	public void WikiTestScreenShot()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//*[@class='link-box'])[1]")).click();
		
	}
	
  @AfterMethod
  public void tearDown(ITestResult result)
  {
	  if(ITestResult.FAILURE == result.getStatus())
		  
		  Utility.CaptureScreenShotA(driver, result.getName());
		  
	  driver.quit();
  }
	
}
