package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JaveScriptExecutor {
	
	
WebDriver driver;
	
	@Test
	public void VerifyDragAndDrop()
	{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naveenk");
	driver.findElement(By.xpath("password")).sendKeys("test@1234");
	WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	
	
	
	
	}
	
 
}
