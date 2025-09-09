/*Q07Fibonacci Series (n terms)
Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.
Example: Input 5 → 0 1 1 2 3.
*/
import java.util.*;
class Fibonacci{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		printFibonacci(n);
	}
	public static void printFibonacci(int n){
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++){
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
	}
}