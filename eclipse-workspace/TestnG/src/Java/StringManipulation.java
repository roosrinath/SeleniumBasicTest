package Java;

public class StringManipulation {

	public static void main(String[] args) {
	
		 String Str = "The rains have started here";
		 
		 String Str1 = "The rains have Started here";
		 
		 
		System.out.println(Str.length());// To find the length;
		
		System.out.println(Str.charAt(10));
		
		System.out.println(Str.indexOf("s"));//First occurrence of S
		
		System.out.println(Str.indexOf("s", Str.indexOf("s")+1)); // Second occurrence of s
		
		System.out.println(Str.indexOf("have"));
		
		System.out.println(Str.indexOf("Suck"));//-1 if u don't find the value, it will return -1
		
		//String Comparison
		
		System.out.println(Str.equals(Str1));// False
		
		System.out.println(Str.equalsIgnoreCase(Str1)); // True
		
		// Sub String
		
		System.out.println(Str.substring(0, 9));//The rains
		
		//Trim
		
		String s = "   How are you   ";
	    System.out.println(s.trim());
	    
	    // Replace
	    
	    System.out.println(s.replace(" ", ""));// it will Single space
	    
	    String date = "10-11-1999";
	    
	    System.out.println(date.replace("-", "/"));
		
	    // Split
	    
	    String test = " Hello_world_how_are_you";
	    
	    String testval[] = test.split("_");
	    
	    for(int i = 0; i<test.length();i++)

	    {
	    	System.out.println(testval[i]);
	    }
	    
		
		
	
	}

}
