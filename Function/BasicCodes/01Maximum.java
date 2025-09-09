/*Q1Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.
*/
import java.util.*;
class Max{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=findMax(a,b);
		System.out.println("Max="+max);
	}
	public static int findMax(int a,int b){
		if(a>b)
			return a;
		else
			return b;
	}
}