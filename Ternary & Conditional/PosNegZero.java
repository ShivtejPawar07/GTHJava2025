 /*Write a Java program to check whether a number is positive , negative or zero.
 */
 import java.util.*;
 public class PosNegZero{
   public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the num");
	 int n=sc.nextInt();
	  
	  String str=n>0?n+" Number is Positive":
	             n<0?n+" Number is Negative":n+" Number is Zero";
				 System.out.println(str);
   }
 }