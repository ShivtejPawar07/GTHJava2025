/*Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.*/

import java.util.*;
class Eligible{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the age");
	  int n=sc.nextInt();
	  
	  if(n>=18){
	  System.out.println("Candidate is Eligible to cast his/her own vote");
	  }
	  else{
	  System.out.println("Candidate is not Eligible to cast his/her own vote");
	  }
   
   }
}