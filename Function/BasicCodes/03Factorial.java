/*Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.
*/
import java.util.*;
class Factorial{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int fact=factorial(n);
		System.out.println("factorial="+fact);
	}
	public static int factorial(int n){
		int f=1;
		for(int i=1;i<=n;i++){
		 f=f*i;
		}
		return f;
	}
}