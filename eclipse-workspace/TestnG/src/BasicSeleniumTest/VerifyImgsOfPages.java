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

public class VerifyImgsOfPages {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/List_of_birds_of_India");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

	@Test
	public void TestVerifyImagesOfPages()
	{
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of Images"+images.size());
		
		for(WebElement el:images)
		{
			System.out.println(el.getAttribute("src"));
		}
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
