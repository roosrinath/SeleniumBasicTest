package BasicSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyTotalCheckBoxex {
	
	WebDriver driver;
	
	@Test
	public void TestVerifyTotalCheckBoxex()throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		List<WebElement> chkBoxes = driver.findElements(By.xpath("//input[@tye='checkbox']"));
		System.out.println(chkBoxes.size());
		
		for(WebElement el:chkBoxes)
		{
			if(!el.isSelected())
			{
				el.click(); 
			}
		}
	}
	

}
