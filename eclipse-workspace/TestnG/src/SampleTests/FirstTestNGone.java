package SampleTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FirstTestNGone {
	
	
	@Test
	public void test2() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
    driver.get("http://www.google.com");
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
	
	driver.close();
	}

}
