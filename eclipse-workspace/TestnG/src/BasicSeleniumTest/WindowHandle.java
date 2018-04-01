package BasicSeleniumTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandle {
	
	WebDriver driver;

	@Test
	public void TestWindowHandle() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    driver = new ChromeDriver();	
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	    System.out.println("Page Title"+driver.getTitle());
	    driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("Page Title"+driver.getTitle());
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> itr = window.iterator();
		
		String perantWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("(//*[@class='active'])[2]")).click();
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(perantWindow);
	}


	//@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
	
}
