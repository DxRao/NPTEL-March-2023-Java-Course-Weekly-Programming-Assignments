package W1PA;

import java.util.Scanner;  


public class CirclePerimeterArea {
	
	public static void main(String[] args) {
	
	
	Scanner s = new Scanner(System.in); 
	       double radius= s.nextDouble();
	       s.close();
	       
	       double perimeter;
	       double area;
	       
	   	//Calculate the perimeter

			perimeter = (2 * Math.PI) * radius;        

	  	//Calculate the area

			area = (Math.PI * radius) * radius;
			
			System.out.println(perimeter);
	        System.out.print(area);
	}


}
