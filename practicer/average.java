package practicer;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num1,num2,num3;
		
		System.out.println("Enter Number: ");
		num1=sc.nextInt();
		System.out.println("Enter Number: ");
		num2=sc.nextInt();
		System.out.println("Enter Number: ");
		num3=sc.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			
			System.out.print("The greatest number: " + num1);
			
		}
		else if (num2 > num1 && num2 >3)  { 
			
			System.out.print("The greatest number: " + num2);
		}
		
		else if (num3 > num1 && num3 > num2) { 
			System.out.print("The greatest number: " + num3);
			
		}
			
		else {  
			
			System.out.print("Invalid Input");
		}
		
	}

}
