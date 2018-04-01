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

public class TotalTextboxesWebPages {
	
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
	public void TestTotalTextboxesWebPages()
	{
      List<WebElement> textboxes= driver.findElements(By.xpath("//input[@type='text']"));
      System.out.println(textboxes.size());
  
	}
	
	@AfterMethod
	public void tearDown()
	{
	   driver.quit();
	}
	
}
