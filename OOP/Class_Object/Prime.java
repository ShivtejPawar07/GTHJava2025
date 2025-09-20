/*14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/
import java.util.*;
class Prime{
	boolean isPrime(int n){
		boolean flag=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		Prime p=new Prime();
		boolean result=p.isPrime(n);
		if(result)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}
}