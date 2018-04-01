package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLinkText {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.wikipedia.org");
		Thread.sleep(3000);
		
	}
	
	@Test(enabled=false)
	public void TestVerifyLinkText() 
	{
		
		driver.findElement(By.linkText("Advertising")).click();
		String title = driver.getTitle();
		//System.out.println("Page Title is :"+title);
		Assert.assertTrue(title.contains("Google Ads - Create Online Ads for Your Business – Google"));
	}

	@Test(enabled=false)
	public void TestVerifyGmailLinkText() 
	{
		driver.findElement(By.linkText("Images")).click();
		String title2 = driver.getTitle();
		System.out.println("Gmail Title is :"+title2);
		Assert.assertTrue(title2.contains("Google Images"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
}
