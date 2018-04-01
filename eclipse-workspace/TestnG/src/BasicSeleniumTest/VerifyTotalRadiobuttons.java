package BasicSeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTotalRadiobuttons {
	
	WebDriver driver;
	
	@Test
	public void TestVerifyTotalRadiobuttons()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type= 'radio']"));
		System.out.println("Total radio buttons"+radioButtons.size());
	}

}
