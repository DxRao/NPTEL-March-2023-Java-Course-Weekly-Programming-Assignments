package W1PA;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {		  
		
		Scanner s = new Scanner(System.in); 
		int x = s.nextInt(); 
		int y = s.nextInt();
		int z = s.nextInt();
		s.close();
		
		int result = 0;
		
		//Use if...else ladder to find the largest among 3 numbers and store the largest number in a variable called result.
		
		if(x > y && x > z){
	  
	  	result = x;
	      
		}
	  
	  	else if(y > z){
	    
	    	result = y;
	    
	  	}
	    else{
	      
	      result = z;   
	    
		}

		System.out.print(result);

	}

}
