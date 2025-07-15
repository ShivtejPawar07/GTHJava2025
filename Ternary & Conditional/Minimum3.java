/*Write a java program to find the minimum between three numbers.*/

import java.util.*;
public class Minimum3{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the three numbers");
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 int n3=sc.nextInt();
	 String result=(n1<n2 && n1<n3) ? n1+" is Minimum":
				   (n2<n1 && n2<n3)? n2+" is Minimum":
				     n3+" is minimum";
				 
	 System.out.println(result);
  
  }
}