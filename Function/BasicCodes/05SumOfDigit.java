/*Q5Sum of Digits
Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.
Example: Input 123 → Output: 6.
*/
import java.util.*;
class Sum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sum=sumOfDigits(n);
		System.out.println("Sum of digit="+sum);
	}
	public static int sumOfDigits(int n){
		int sum=0;
		while(n!=0){
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}