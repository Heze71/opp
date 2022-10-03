package practicer;

import java.util.*;
public class easy3 {

	public static void main(String[] args) {
	
		float first,second;
	    
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your height here: ");
		first = sc.nextFloat();
		System.out.print ("Repeat your height here:");
		second= sc.nextFloat();
		
	
		if (first == second || second == first) { 
			
			System.out.print("They are the same");
			
		}

		else { 
			
			System.out.print("They are not the same");
		}
	}

}
