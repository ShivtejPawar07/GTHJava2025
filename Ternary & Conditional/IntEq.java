/*Write a java program to accept two integers and check whether they are equal or not.*/
import java.util.*;
public class IntEq{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the two numbers");
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 String result=(n1==n2)?"Integers are equal":"Integers not equal";
	 System.out.println(result);
  }
}