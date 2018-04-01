package Java;

public class Remove_Junk {

	public static void main(String[] args) 
	{
		
		String s = " Srinath @#$% 12345";
		
		//Regular expression ; [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s);
		
	}

}
