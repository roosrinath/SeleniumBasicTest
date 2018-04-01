package BasicSeleniumTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShot {
	
	WebDriver driver;
	
	@Test
	public void TestScreenShot()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(scr, new File("d://screen.png"));
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
