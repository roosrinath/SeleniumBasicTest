package BasicSeleniumTest;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyPopUpText {
	

	WebDriver driver;
	
	@Test
	public void TestVerifyPopUpText()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.wikipedia.org");
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.confirm('Dismiss this alert')");
	    
	    Alert confirm = driver.switchTo().alert();
	    String Text = confirm.getText();
	    System.out.println("Alert Text is :"+Text);
	}

}
