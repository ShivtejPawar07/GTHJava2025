/*Write a java program to find maximum between three numbers.*/
import java.util.*;
public class Maximum{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the Three numbers");
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 int n3=sc.nextInt();
	 String result=(n1>n2 && n1>n3) ?
	               n1+"is Maximum":
				   (n2>n1 && n2>n3)?
				   n2+"is Maximum":
				   n3+"is maximum";
	 System.out.println(result);
  
  }
}