/*Q57. Create a Java program using switch to convert a given number (1-5) to its word
 equivalent (One, Two, ..., Five). If the number is not between 1 and 5, display 
 “Invalid number”.
Explanation:
 Switch with cases 1 to 5; default to handle invalid numbers.*/
 import java.util.*;
 class Num{
   public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	
	 int n;
	 do{
	 System.out.println("enter a num(1-5)");
	  n=sc.nextInt();
	 switch(n)
	 {
	   case 1:System.out.println("one");
	   break;
	   case 2:System.out.println("two");
	   break;
	   case 3:System.out.println("three");
	   break;
	   case 4:System.out.println("four");
	   break;
	   case 5:System.out.println("five");
	   break;
	   case 6:System.out.println("thank you visit again");
	   break;
	   default:
	   System.out.println("Invalid condition");
	 }
	 }while(n!=6);
	 
   }
 }
 