package Java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String names[] = {"Java", "Ruby", "Manchi", "You", "Manchi" };
		
		// 1. Compare each element  0(nxn) ON square solution
		
		for (int i=0; i<=names.length;i++)
		{
			
			for(int j=i+1; j<names.length;j++) {
				
				if(names[i].equals(names[j])) { 
					
					System.out.println("duplicate Elements is :" + names[i] );
					
				}
			}
		}
		
		// 2 Using Hash set: Java Collections it stores Unique values
		
		Set<String> store = new HashSet<String>();
		
		for(String name : names)
		{
			if(store.add(name) == false)
			{
				System.out.println("Duplicate elements :"+name);
			}
		}
		
		// 3. Using HashMap : Java Collections
		// Map will store the values Key and value format
		
		
		
		
		
	
	
	}

}
