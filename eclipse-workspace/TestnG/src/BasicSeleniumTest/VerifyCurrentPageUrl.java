package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyCurrentPageUrl {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
     public void verifyCurrentPageUrlTest()
     
	{
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertTrue(url.contains("https://www.google.co.in/?gws_rd=ssl"));
	System.out.println("Page Url verified");
	}
	// Assert.assertEquals("https://www.google.co.in/?gws_rd=ssl", url);
	
	@Test
	public void verifyCurrentPageUrlTestwithString()
	{

	String Url2 = driver.getCurrentUrl();
	System.out.println(Url2);
	Assert.assertEquals(Url2, "https://www.google.co.in/?gws_rd=ssl");
	System.out.println("Page Url2 Verified");
	
	
	// http://www.tupaki.com
	
	}
	
	@Test
	public void VerfyCurrentPageUrl3()
	{
		
		String Url3 = driver.getCurrentUrl();
		System.out.println(Url3);
		Assert.assertTrue(Url3.contains("https://www.google.co.in/?gws_rd=ssl"));
		System.out.println("Page Url3 Verified");
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
