package Java;

public class ReverseString {

	public static void main(String[] args) 
	{
	//String is a immutable object
	// Sting is a Class
	// Step 1- Using for loop method	
	String s = "Selenium";//8

	int len = s.length();
	
	String rev = "";
	
	for(int i=len-1;i>=0; i--) {
		
		rev = rev+s.charAt(i);
	}

	System.out.println(rev);
	
	// Step 2 - Using StringBuffer class
	// StringBuffer is mutable class
	
	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());
	
	
	
	}

}
