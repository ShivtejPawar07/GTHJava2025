/*11Write a function to check whether a number is prime or not.
*/
import java.util.*;
class Prime{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean result=isPrime(n);
		if(result)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}