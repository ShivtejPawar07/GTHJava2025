/*Q4Write a program to check whether a given number is a palindrome using recursion.
*/
import java.util.*;
class Power{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		boolean r=palindrome(b,i);
		if(r)
			System.out.println("Palindrome");
		else	
			System.out.println("Not Palindrome");
	}
	public static int palindrome(int n){
	int p=1;
		if(n!=0){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10
		}
		return rev+palindrome(n);
	}
}