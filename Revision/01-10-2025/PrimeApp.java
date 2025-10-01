/*9. Write a program to check if a number is prime or not?
*/
import java.util.*;
class PrimeApp{
	public static void isPrime(int n){
		int sum=0;
		boolean flag=true;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=false;
			}
		}
		System.out.println(flag?"Prime":"Not");
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		PrimeApp.isPrime(n);
	}
}