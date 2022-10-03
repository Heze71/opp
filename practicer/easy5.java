package practicer;

import java.util.*;
public class easy5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
        int age , human_y=0;
        
        System.out.print("Enter the dog's age: ");
        age = sc.nextInt();
        
        
        switch (age) { 
           
        case 1:
        	human_y = 15;
            System.out.print("The equivalent dog's age to human year is: " + human_y);
            break;
        case 2:
        	human_y = 24;
            
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        case 3:
        	human_y = 28;
            
            System.out.print("The equivalent dog's age to human year is: " + human_y);  
        	break;
        case 4:
        	human_y = 32;
            
            System.out.print("The equivalent dog's age to human year is: " + human_y);  
        	break;
        case 5:
        	human_y = 36;
            
            System.out.print("The equivalent dog's age to human year is: " + human_y);
            break;
        case 6:
        	human_y = 40;
            
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        case 7:
        	human_y = 44;       
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        case 8:
        	human_y = 48;       
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        case 9:
        	human_y = 52;       
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        case 10:
        	human_y = 56;       
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        case 11:
        	human_y = 60;       
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        case 12:
        	human_y = 64;       
            System.out.print("The equivalent dog's age to human year is: " + human_y);
        	  break;
        default :
        	System.out.print("You input invalid value");
        }
        
 
	}

}
