/*7. Write a program to input numbers and check if the number is palindrome or not?
*/
import java.util.*;
class Palindrome{
	public static int palindrome(int n){
		int rev=0;
		int temp=n;
		while(n!=0){
			rev=rev*10+(n%10);
			n/=10;
		}
		System.out.println(rev==temp?" is palindrome":"Not");
	}
}
class PalindromeApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		Palindrome.palindrome(n);
		
	}
}