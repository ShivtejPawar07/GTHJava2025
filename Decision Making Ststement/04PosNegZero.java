/*Q4. Write a Java program to check whether a number is positive , negative or zero.*/
import java.util.*;
class PosNegZero{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	   
	  if(n>0){
	  System.out.println(n +"Positive number");
	  }
	  else if(n<0){
	  System.out.println(n +"Negative number");
	  }
	  else {
	   System.out.println(n +"Zero");
	  }
   
   }
}