/*15Write a program to calculate the nth triangular number using recursion*/
import java.util.*;
class TriangularNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int result = triangular(n);
        System.out.println("The " + n + "th triangular number is: " + result);
    }
    // Recursive function to calculate nth triangular number
    public static int triangular(int n) {
        if (n == 1) {
            return 1;  // base case
        }
        return n + triangular(n - 1);
    }
}
