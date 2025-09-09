/*Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.*/
import java.util.*;
class Prime{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
	    boolean prime=isPrime(n);
		if(prime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
}