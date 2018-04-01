package BasicSeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyAllObjectsInPage {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test
	public void TestVerifyAllObjectsInPage()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(" All links are"+links.size());
		
		for(WebElement el:links){
			{
				System.out.println(el.getAttribute("a"));
			}
		}
	}
	
	@Test
	public void AllUrlsOfPages()
	{
		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
		System.out.println("All urls of page"+allUrls.size());
		
		for(WebElement el:allUrls)
		{
			System.out.println(el.getAttribute("href"));
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
