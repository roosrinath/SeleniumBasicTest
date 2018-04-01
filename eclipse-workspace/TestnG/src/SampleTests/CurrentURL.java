package SampleTests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CurrentURL {
	
	public WebDriver driver;
	
	@Test
	public void test2() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
   
	driver.get("http://www.google.com");
 
	System.out.println(driver.getCurrentUrl());

	driver.close();
	}

}
