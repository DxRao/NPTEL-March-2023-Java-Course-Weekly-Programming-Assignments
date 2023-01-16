package W1PA;

import java.util.Scanner;

public class isArmstrongNumber {

	public static void main(String[] args) {		
		
			   Scanner sc = new Scanner(System.in);
			   int n=sc.nextInt();
			   sc.close();
		       int result = 0;
		       
		     //Use while loop to check if the number is Armstrong or not.

				int inputNumber = n;

				int sumOfDigits = 0; 

				int lastdigit = 0;
		         
		         while(n > 0) {
		        	 
		        	 lastdigit = n%10;
		           
		        	 n = n/10;
		           
		        	 sumOfDigits = sumOfDigits + (lastdigit*lastdigit*lastdigit);
		        	 
		         }
		         
				//store the output(1 or 0) in result variable.

				if(inputNumber ==sumOfDigits)
		           
		        	 result = 1;

		         else
		           
		        	 result = 0;

		         System.out.print(result);

	}

}