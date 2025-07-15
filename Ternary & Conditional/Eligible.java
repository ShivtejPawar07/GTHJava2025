/* Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.*/
import java.util.*;
public class Eligible{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the age");
	 int age=sc.nextInt();
	 String result=(age>=18) ?"candidate eligible to cast his/her own vote":
	                           "candidate eligible not to cast his/her own vote";
	 System.out.println(result);
  
  }
}