/*Q.54 Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.*/

import java.util.*;
public class SwitchDay
{ 
   public static void main(String x[])
   { 
      Scanner sc= new Scanner(System.in);
	  int ch;
	  System.out.println("Enter day number");
	  ch=sc.nextInt();
	  switch(ch)
	  {
	     case 1,2,3,4,5:
		      System.out.println("Weekday");
		      break;
		 
		 case 6,7:
		       System.out.println("Weekend");
		       break;
		 
		 default:
		  System.out.println("Invalid day Number");
	  }
   }
}