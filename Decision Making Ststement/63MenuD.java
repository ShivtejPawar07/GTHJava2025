/*Q63. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.
*/
import java.util.*;
class MDS{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	int ch;
	do{
	System.out.println("1.Check Number is positive , negative or zero");
	System.out.println("2.Check Number is even or odd");
	System.out.println("3.To find the max number using 2 numbers");
	System.out.println("enter your choice");
	 ch=sc.nextInt();
	
	switch(ch){
	  case 1:System.out.println("Enter a num");
	         int n=sc.nextInt();
			 if(n>0)
			  System.out.println(n+ "is Positive");
			 else if(n<0)
			  System.out.println(n+ "is Negative");
			 else
			  System.out.println(n+ "is Zero");
			  
      break;
	  
	  case 2:System.out.println("Enter a num");
	         int n3=sc.nextInt();
			 if(n3%2==0)
			  System.out.println(n3+ "is Even");
			 else
			  System.out.println(n3+ "is odd");
	  
	  break;
	  
	  case 3:System.out.println("Enter a two num");
	         int n1=sc.nextInt();
			 int n2=sc.nextInt();
			 if(n1>n2)
			  System.out.println(n1+ "is Max");
			 else
			  System.out.println(n2+ "is Max");
	
	 break;
	 
	 default:
	   System.out.println("Invalid Choice");
	  
	}
	}while(ch!=3);
	
	
  }
}