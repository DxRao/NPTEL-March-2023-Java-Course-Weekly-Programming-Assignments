package W1PA;

import java.util.Scanner;

public class AverageArrayElements {

	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		
		double mark_avg;
		int result;
		int i;
		int s;
		
		//define size of array
		s = input.nextInt();
		
		//The array is defined "arr" and inserted marks into it.
		int[] arr = new int[s];   
		      
		for(i=0;i<arr.length;i++){
			
			arr[i]=input.nextInt();
		}
		
		input.close();
		
		//Initialize maximum element as first element of the array. 

		int max = arr[0];

	   //Traverse array elements to get the current max.

		double total = arr[0];

		for(i = 1; i < arr.length; i++){
	      
	      	total = total + arr[i];
			
	      	if(arr[i] > max){ 	
		
				max = arr[i];      
			}
	    }

	   //Store the highest mark in the variable result.

			result = max;
	   
		//Store average mark in avgMarks.

			mark_avg = total / s;

			System.out.println(result);

			System.out.print(mark_avg);	
	}
}
