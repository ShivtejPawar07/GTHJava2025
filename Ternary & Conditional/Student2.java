/*Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)

— using nested ternary operators.*/
import java.util.*;
public class Student2{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the score");
	 Double s=sc.nextDouble();
	
	 String result=(s>=90 && s<=100) ? "Student is Excellent":
				   (s>=75 && s<90)?"Student is Good":
				   (s>=50 && s<75)?"student is Average":
				     "Student is poor";
				 
	 System.out.println(result);
  
  }
}