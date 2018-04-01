package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ReadfontProperties {
	
	WebDriver driver;
	
	@Test
	public void TestReadFontProperties()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Wikipedia:About");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("n-mainpage-description"));
		
		String fontColor = element.getCssValue("color");
	    System.out.println("Font Color :"+fontColor);
	    
	    String fontSize = element.getCssValue("font-size");
	    System.out.println("Font Size :"+fontSize);
	    
	    String fontFamily = element.getCssValue("font-family");
	    System.out.println("Font Family :"+fontFamily);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
