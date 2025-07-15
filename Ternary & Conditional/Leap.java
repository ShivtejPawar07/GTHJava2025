/* Write a Java program to check whether a year is leap year or not.*/
import java.util.*;
public class Leap{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the years");
	 int year=sc.nextInt();
	 String result=((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ?"It is leap year":"It is not leap year";
	 System.out.println(result);
  
  }
}