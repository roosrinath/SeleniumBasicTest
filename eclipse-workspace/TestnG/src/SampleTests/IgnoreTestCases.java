package SampleTests;
import org.testng.annotations.Test;

public class IgnoreTestCases {
	
	@Test
	public void test1()
	{
		System.out.println("Test1 Method");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 Method");
	}
	
	@Test(enabled = false)
	public void test3()
	{
		System.out.println("Test3 Method");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Test4 Method");
	}
	
	@Test(enabled = false)
	public void test5()
	{
		System.out.println("Test5 Method");
	}

}
