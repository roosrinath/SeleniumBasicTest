package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetSizeOfElement {
	
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
	public void TestGetSizeOfElement()
	{
		Dimension D = driver.findElement(By.id("lst-ib")).getSize();
		
		System.out.println("Width of the Element :"+D.width);
		System.out.println("Height of the Element :"+D.height);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
