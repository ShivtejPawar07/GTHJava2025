/*Q3Write a program to calculate the power of a number (x^n) using recursion.*/
import java.util.*;
class Power{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base and index");
		int b=sc.nextInt();
		int i=sc.nextInt();
		int r=pow(b,i);
		System.out.println("Pow="+r);
	}
	public static int pow(int b,int i){
		if(i==0)
		   return 1;
		else
		   return b*pow(b,--i);
	}
}