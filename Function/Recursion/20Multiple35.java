/*20. Write a program to calculate the sum of all multiples of 3 or 5 up to n using recursion.
*/
import java.util.*;
class SumOfMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int result = sumMultiples(n);
        System.out.println("Sum of multiples of 3 or 5 up to " + n + " = " + result);
    }

    // Recursive function to calculate sum of multiples of 3 or 5
    public static int sumMultiples(int n) {
        if (n==0) {
            return 0; // base case
        }
        if (n%3==0 || n%5==0) {
            return n + sumMultiples(n - 1);
        } else {
            return sumMultiples(n - 1);
        }
    }
}
