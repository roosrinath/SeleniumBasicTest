package Java;

import java.util.Arrays;

public class SmallLargerNumber {

	public static void main(String[] args) {
		
        int numbers[]= { -10, -40, 10, 30, 567 };
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
			
			if(numbers[i]>largest)
			{
				largest = numbers[i]; // 10 30 
			}
		
			else if(numbers[i]<smallest) {
				
				smallest = numbers[i]; //-10 -40
			}
		
		System.out.println("/ Array number is "+ Arrays.toString(numbers));
		
		System.out.println("Largest Number is " + largest);
		
	    System.out.println("Smallest number is " + smallest);

	}

}
