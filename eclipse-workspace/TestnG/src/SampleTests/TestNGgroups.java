package SampleTests;
import org.testng.annotations.Test;

public class TestNGgroups {
	
	
	@Test(groups = {"Home Page"})
	public void logtest()
	{
		System.out.println("Logo Test");
	}
	
	@Test(groups = {"Search Page"})
	public void Searchtest()
	{
		System.out.println("Search Test");
	}
	
	@Test(groups = {"Reg Page"})
	public void Regtest()
	{
		System.out.println("Reg Test");
	}
	
	@Test(groups = {"Login Page"})
	public void logintest()
	{
		System.out.println("Login Test");
	}
	
	@Test(groups = {"Login Page"})
	public void SignUptest()
	{
		System.out.println("SignUp Test");
	}
	
	
	
	

}
