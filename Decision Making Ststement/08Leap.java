/*Q8. Write a Java program to check whether a year is a leap year or not*/

import java.util.*;
class Leap{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the year");
	  int year=sc.nextInt();
	   
	  if(year%4==0 && year%100!=0 || year%400==0){
	  System.out.println(year +"is leap year");
	  }
	  else {
	   System.out.println(year +"is not leap year");
	  }
   
   }
}