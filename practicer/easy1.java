package practicer;

import java.util.*;
public class easy1 {

	public static void main(String[] args) {
	
	int num;	
    Scanner sc = new Scanner (System.in);
    
		System.out.println("Enter Number:");
		num = sc.nextInt();
		
		if (num%2==0 || num==0) { 
			
			System.out.print("This is an even number & zero number");	
		}
		
		else if (num%2 !=0) { 
		   System.out.print("This is an odd number");

		}
		
		
		else if (num < 0) { 
			
			System.out.print(" This is a negative number");
			
		}
		
		else { 
			
			System.out.println("Invalid Input");
		}
		
		
	
 	}

}
