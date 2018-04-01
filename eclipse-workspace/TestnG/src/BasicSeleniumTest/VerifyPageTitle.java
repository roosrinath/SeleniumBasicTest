package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	// Google
	@Test
	public void TestVerifyPageTitle()
	{
		String Title = driver.getTitle();
		System.out.println("Google Title is:"+Title);
		Assert.assertEquals("Google", "Google");
		System.out.println("Google Page Title verified");
		
	}
	
	@Test
	public void TestVerifyPageTitlewithBoolean()
	{
		String Title2= driver.getTitle();
		System.out.println("Google Title2"+Title2);
		Assert.assertTrue(Title2.contains("Google"));
		System.out.println("Google Page Title verified");
		
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
