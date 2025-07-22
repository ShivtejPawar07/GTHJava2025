/*Q53: Create a Java program to simulate a simple calculator using a switch case. 
It should take two numbers and an operator (+, -, *, /, %) as input and perform 
the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations.
 Add default to handle invalid operators.
*/
import java.util.*;
class ASMD{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("enter your choice");
	int ch=sc.nextInt();
	System.out.println("Enter a num");
	         int n1=sc.nextInt();
			 int n2=sc.nextInt();
	switch(ch){
	  case 1:
			 System.out.println("Addition:"+(n1+n2));	  
      break;
	  
	  case 2:
	  System.out.println("Substraction:"+(n1-n2));	
	  break;
	  
	  case 3:
	  System.out.println("Multiplication:"+(n1*n2));	
	 break;
	 
	  case 4:
	  System.out.println("Division:"+(n1/n2));	
	 break;
	 
	 case 5:
	  System.out.println("Mode:"+(n1%n2));	
	 break;
	 
	 default:
	   System.out.println("Invalid Choice");
	  
	}
	
	
	
  }
}