/*Given a number 1–7, print the day name.*/
import java.util.*;
public class NumDay{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the num");
	 int a=sc.nextInt();
	
	 String result=(a==1)?"Sunday":
	               (a==2)?"Monday":
				   (a==3)?"Tuesday":
				   (a==4)?"Wedensday":
				   (a==5)?"THursday":
				   (a==6)?"Friday":
				   (a==7)?"Saturday":
				   "INvalid Number";
				   
				
	 System.out.println(result);
  
  }
}