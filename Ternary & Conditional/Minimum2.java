/*Write a java program to find the minimum between two numbers.*/

import java.util.*;
public class Minimum2{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the two numbers");
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 String result=(n1<n2) ?
	               n1+" is Minimum":
				   n2+" is Minimum";
				 
	 System.out.println(result);
  
  }
}