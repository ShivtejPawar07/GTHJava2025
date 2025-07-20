/*Q1. Write a Java program to check whether a number is even or odd.*/
import java.util.*;
class EvenOdd{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number");
	  int n=sc.nextInt();
	  
	  if(n%2==0){
	  System.out.println(n +"Even number");
	  }
	  else{
	  System.out.println(n +"odd number");
	  }
   
   }
}