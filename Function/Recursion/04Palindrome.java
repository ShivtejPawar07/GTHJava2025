/*/*Q4Write a program to check whether a given number is a palindrome using recursion. */*/
import java.util.*;
class PalindromeRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();

        if (isPalindrome(n,0,n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    // Recursive function
    public static boolean isPalindrome(int n, int rev, int original) {
        if (n==0) {
            return rev==original; // check if reversed equals original
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        return isPalindrome(n / 10, rev, original);
    }
}
