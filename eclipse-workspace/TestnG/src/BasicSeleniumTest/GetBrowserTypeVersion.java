package BasicSeleniumTest;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GetBrowserTypeVersion {
	
	WebDriver driver;
	
	@Test
	public void TestBrowserTypeVersion()
	{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	driver = new ChromeDriver();
	
	Capabilities caps = ((RemoteWebDriver)driver).getCapabilities();
	String browserName = caps.getBrowserName();
	String browserVersion = caps.getVersion();
	
	System.out.println(browserName+" "+browserVersion);
	}
	
	

}
