package W1PA;

import java.util.Scanner;

public class AddEvenNumbers {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
			   
		int n=sc.nextInt();
			   
		int sum=0;
		
		int count = 0;

		for(int i =0; count <= n; i++  ){
	      
	      if(i%2 == 0){
	        
	      	if(i%3 == 0){     
	      
	      		sum = sum + i;      	  
	      	}
	      	
	      count = count +1;
	        
	      }
	      
		}
		
		System.out.print(sum);		
	}
}
