package SampleTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleBeforeAfter {
	
	@Test
	public void demoTest1()
	{
		System.out.println("Demo1 running");
	}

	@BeforeMethod
	public void demoTest2()
	{
		System.out.println("Demo2 running");	
	}

	@AfterMethod
	public void demoTest3()
	{
		System.out.println("Demo3 running");
	}

}
