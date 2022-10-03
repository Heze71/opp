package practicer;


import java.util.*;
public class difficult_practice {

	
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int o1 = 35,o2 = 65,o3 = 45,o4 = 50, o5=30,o6 = 105;
	    int order=0,again,total=0;

	    
	    
	    
	    do { 
	    System.out.println("[1]Hamburger\n[2]Cheese Burger\n[3]Chicken Burger\n[4]Fish Burger\n[5]Veggie Burger\n[6]Big Burger");
	    System.out.print("Enter your order: ");
	    order=sc.nextInt();
	    System.out.print("Do you want to order again?\nType [1] if yes , and [2] if no: ");
	    again = sc.nextInt();  
	    System.out.println ("*************************************************************************************************");
	    
	    
	 
	    
			    switch (order) { 
			    
			    case 1: 
			    	total =+o1;
			    	break;
			    case 2: 
			    	total =+o2;
			    	break;
			    case 3: 
			    	total =+o3;
			    	break;
			    case 4: 
			    	total =+o4;
			    	break;
			    case 5: 
			    	total =+o5;
			    	break;
			    case 6: 
			    	total =+o6;
			    	break; 	
			    	
			    }
	    
	    
	    }while (again == 1 );
	    
	   System.out.print(total );
		
	}
}