/*Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.*/
import java.util.*;
class Divisible{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	   
	  if(n%5==0 && n%11==0){
	  System.out.println("number is divisible by 5 and 11");
	  }
	  else {
	   System.out.println("number is not divisible by 5 and 11");
	  }
   
   }
}