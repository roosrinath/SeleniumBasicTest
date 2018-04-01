package SampleTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyInTestNG {
	
	
	@Test
	public void Test1()
	{
		System.out.println("Test1 Method");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = {"Test1"})
	public void Test2()
	{
		System.out.println("Test2 Method");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"Test2"})
	public void Test3()
	{
		System.out.println("Test3 Method");
	}
	
	
	
}
