/* Q13. Write a java program to accept two integers and check whether they are equal or not.*/

import java.util.*;
class NumEqual{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the two	number");
	  int n1=sc.nextInt();
	  int n2=sc.nextInt();
	  
	  if(n1==n2){
	  System.out.println("Number are equal");
	  }
	  else{
	   System.out.println("Number are not equal");
	  }
   
   }
}