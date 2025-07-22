/*Q61. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation:
 Switch on food item number. Print item name and price. Default for invalid selection.
*/
import java.util.*;
class Food{
  public static void main(String x[]){
	  Scanner sc=new Scanner(System.in);
    System.out.println("1: Burger");
	System.out.println("2: Pizza");
	System.out.println("3: Pasta");
	System.out.println("4: Sandwich");
	System.out.println("enter your choice");
	int ch=sc.nextInt();
	
	switch(ch){
	  case 1:System.out.println("Item Name: Burger");
	         System.out.println("Item Price: 500");
	  break;	  
	  case 2:System.out.println("Item Name: Pizaa");
	         System.out.println("Item Price: 400");
		break;	 
      case 3:System.out.println("Item Name: Pasta");
	         System.out.println("Item Price: 450");
		break;	 
	 case 4:System.out.println("Item Name: Sandwich");
	         System.out.println("Item Price: 600");	
       break;
     default:System.out.println("Invalid Input");				 
	}
			 
	
	
  }
}