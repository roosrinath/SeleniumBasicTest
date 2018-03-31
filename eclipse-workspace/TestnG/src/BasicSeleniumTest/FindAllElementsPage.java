package BasicSeleniumTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindAllElementsPage {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test
	public void TestFindAllElementsPage()
	{
		List<WebElement>elements = driver.findElements(By.xpath("//*"));
		System.out.println("Total no of elements in Webpage"+elements.size());
		
		for(WebElement el:elements)
		{
			System.out.println(el.getTagName()+" : "+el.getText());
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
