package Java;

public class SwapwithoutThirdVar {

	public static void main(String[] args) {
		
		
		int x = 5;
		int y = 10;
		
		// x= 10, y= 5
		
		// 1. Using third variable
		
		// int t;
		
		//t=x;//5
		//x=y;//10 
	    //y=t; // 5
		
	   
		// 2 . without using third variable
	//	x = x+y; //5+10 = 15
	//	y = x-y; // 15-10= 5
	//	x = x-y; // 15-5 = 10
		
		
		// 3. without using third variable   Using * operator 
		
		// x = x * y; // 5*10 = 50
		// y = x/y; // 50/10 = 5
		
		// x = x/y;  // 50/5 = 10
		
		
		// 4 By using XOR 
		
		x = x ^ y; // 15 1111
		y = x ^ y; // 5  0101
		x = x ^ y; // 10 1010
		
		System.out.println("x value is " + x);
		System.out.println("y value is " + y);

	}

}
