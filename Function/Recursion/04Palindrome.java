/*Q4Write a program to check whether a given number is a palindrome using recursion. */
import java.util.*;
class PalindromeRec {
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int reverse=isRev(n,0);
		if(reverse==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not");
	}
    // Recursive function to reverse a number
    public static int isRev(int n,int rev){
		if(n==0){
			return rev;
		}
		return isRev(n/10, rev* 10 + n % 10);
	}
}

