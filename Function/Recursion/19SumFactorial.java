/*19Write a program to find the sum of factorials from 1 to n using recursion.
*/
import java.util.*;
class SumOfFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int result = sumFactorials(n);
        System.out.println("Sum of factorials = " + result);
    }

    // Recursive function to calculate sum of factorials
    public static int sumFactorials(int n) {
        if (n==1) {
            return 1;  // base case (1! = 1)
        }
        return factorial(n) + sumFactorials(n - 1);
    }

    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n==0|| n==1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
