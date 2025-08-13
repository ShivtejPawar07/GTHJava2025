/*Q37. Write a java program to enter a number and print it in words.
*/
import java.util.*;
class NumWord{
  public static void main(String x[]){
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int n=sc.nextInt();
	   int rev=0;
	   while(n!=0){
	     int rem=n%10;
	       rev=rev*10+rem;
	      n/=10;
	   }
	   while(rev!=0){
		   int r=rev%10;
	   switch(r){
		 case 0:
		System.out.print("Zero ");
		 break;
		 
	     case 1:
		 System.out.print("one ");
		 break;
		 
		 case 2:
		 System.out.print("two ");
		 break;
		 case 3:
		 System.out.print("three ");
		 break;
		 case 4:
		 System.out.print("four ");
		 break;
		 case 5:
		 System.out.print("five ");
		 break;
		 case 6:
		 System.out.print("six ");
		 break;
		 case 7:
		 System.out.print("seven ");
		 break;
		 case 8:
		 System.out.print("eight ");
		 break;
		 case 9:
		 System.out.print("nine ");
		break;
        		
	   }
	   rev/=10;
	   }
  }
}