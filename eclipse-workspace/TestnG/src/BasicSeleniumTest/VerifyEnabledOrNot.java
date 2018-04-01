package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyEnabledOrNot {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void TestElementEnabledOrNot()
	{
		WebElement Ele = driver.findElement(By.xpath("(//input[@value='Google Search'])[1]"));
		
		if(!Ele.isEnabled())
		{
			System.out.println("Element is not enabled");
		}
		else
		{
			System.out.println("Element is Present");
		}
		
	}

}
