/*Q2. Write a Java program to check whether a triangle is valid or not.*/
import java.util.*;
class TriValid{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the three angle");
	  int a1=sc.nextInt();
	  int a2=sc.nextInt();
	  int a3=sc.nextInt();
	  
	  if(a1+a2+a3==180){
	  System.out.println("Triangle is valid");
	  }
	  else{
	  System.out.println("Triangle is not valid");
	  }
   
   }
}