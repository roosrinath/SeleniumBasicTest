package SampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageSource {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethodPageSource()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.example.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	
@Test
public void PageSourceTest() throws InterruptedException
{
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	Thread.sleep(5000);	
}

@AfterMethod
public void AfterMethodPageSource()
{
	driver.quit();
}

	
	


}
