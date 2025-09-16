/*12Write a program to check whether a given number is prime using recursion.*/
import java.util.*;
class PrimeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not prime");
        } else if (isPrime(n, 2)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    // Recursive function to check prime
    public static boolean isPrime(int n, int i) {
        if (i * i > n) {
            return true; // no divisor found
        }
        if (n % i == 0) {
            return false; // divisor found
        }
        return isPrime(n, i + 1); // check next divisor
    }
}
