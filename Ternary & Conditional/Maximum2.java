/*Write a java program to find the Maximum between two numbers.*/

import java.util.*;
public class Maximum2{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the two numbers");
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 String result=(n1>n2) ?
	               n1+" is Maximum":
				   n2+" is Maximum";
				 
	 System.out.println(result);
  //int max=Math.max(n1,n2);
  }
}