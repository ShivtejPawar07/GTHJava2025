/*
**2. Menu-Driven Calculator**

**Description:**

* Display a menu with 4 operations: Add, Subtract, Multiply, Divide.
* Use a do-while loop to keep showing the menu until the user chooses "Exit".
* Use **continue** to skip calculation if the user enters an invalid choice.
* If the user enters "Exit", **break** the loop.
*/
import java.util.*;
class AApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Num");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int ch;
		do{
			System.out.println("Menu Driven");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multilication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			
			switch(ch){
				case 1:System.out.println("Adiition:"+(n1+n2));
				break;
				
				case 2:System.out.println("Substraction:"+(n1-n2));
				break;
				
				case 3:System.out.println("Multiplication:"+(n1*n2));
				break;
				
				case 4:System.out.println("Division:"+(n1/n2));
				break;
				
				case 5:System.out.println("Thank you...!");
				break;
				
				default:System.out.println("Invalid Choice");
				continue;

				
			}
		}while(ch!=5);
		
	}
}