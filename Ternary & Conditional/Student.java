/* Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.*/
import java.util.*;
public class Student{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the score");
	 int s=sc.nextInt();
	
	 String result=(s>=40 && s<=100) ?
	               "Student is pass":
				   "Student is fail";
				 
	 System.out.println(result);
  
  }
}