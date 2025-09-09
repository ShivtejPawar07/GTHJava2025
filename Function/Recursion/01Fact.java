/*Q1.Write a program to calculate the factorial of a given number using recursion..
*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=fact(n);
		System.out.println("Factorial="+r);
	}
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		return n*fact(n-1);
	}
}