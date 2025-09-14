/*6QWrite a program to find the greatest common divisor (GCD) of two numbers using recursion.*/
import java.util.*;
class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    // Recursive function to find GCD
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;// base case
        }
        return findGCD(b,a%b); // recursion (Euclidean algorithm)
    }
}
