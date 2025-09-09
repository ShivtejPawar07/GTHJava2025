/*Q6Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.
*/
import java.util.*;
class Reverse{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int rev=reverseNumber(n);
		System.out.println("Reverse of digit="+rev);
	}
	public static int reverseNumber(int n){
		int rev=0;
		while(n!=0){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}