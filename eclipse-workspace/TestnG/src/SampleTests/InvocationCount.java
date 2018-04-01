package SampleTests;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 5)
	public void SerachText()
	{
		System.out.println("Search Text Method");
	}

	@Test(timeOut = 10)
	public void test()
	{
		System.out.println("Test");
	}
	
	
}
