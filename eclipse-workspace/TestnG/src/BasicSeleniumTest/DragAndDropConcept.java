package BasicSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropConcept {
	

	WebDriver driver;
	
	@Test
	public void VerifyDragAndDrop()
	{
	//	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	//    driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		WebElement From = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement To = driver.findElement(By.xpath("//*[@id='droppable']"));
		action.clickAndHold(From).moveToElement(To).release().build().perform();
		
	}
}
