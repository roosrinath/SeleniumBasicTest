package Java;

public class StringSwap {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swapping");
		System.out.println("a value is " +a);
		System.out.println("b value is " +b);
		
		//1. append a and b
		
		a = a+b;//HelloWorld
		
		//2. Store initial string a in b
		
		b = a.substring(0, a.length()-b.length());
		
		// 3. Store initial string b in a
		
		a = a.substring(b.length());
		
		System.out.println("After Swapping");
		System.out.println("a value is " +a);
		System.out.println("b value is " +b);

	}

}
