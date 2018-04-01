package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTextPresentWebPage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Flag_Day_(Australia)");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

	@Test
	public void VerifyText() {
	
	try{
		boolean b = driver.getPageSource().contains("Australian National Flag Day");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	@Test
	public void TestVerfifyTextPresentinWebPage()
	{
		
		if(driver.getPageSource().contains("Australian National Flag Day"))
		{
			System.out.println("Text is present");
		}
		
		else{
			
			System.out.println("Text is not present");
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
