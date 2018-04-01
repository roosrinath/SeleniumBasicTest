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

public class TotalFrames {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void TestTotalFrames()
	{
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Number fo Frames"+frames.size());
		
		for(WebElement el:frames)
		{
			System.out.println("Total Number of Frame ID: "+el.getAttribute("id"));
			
		}
	}
	
	@Test
	public void TestTotalFramesWithNames()
	{
		List<WebElement> Tframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no of Frames "+Tframes.size());
		
		for(WebElement el2:Tframes)
		{
			System.out.println("Total Frame Names: "+el2.getAttribute("name"));
		}
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
