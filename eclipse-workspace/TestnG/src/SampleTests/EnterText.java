package SampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnterText {
	
   public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe/");
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
	}
	
	@Test
	public void enterText()
	{
		
		driver.findElement(By.id("lst-ib")).sendKeys("Srinath");
	}
	
	@AfterTest
	public void tearDown()
	{
	driver.quit();	
	}
}
