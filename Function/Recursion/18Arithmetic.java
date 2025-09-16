/*18.Write a program to calculate the nth term of an arithmetic series using recursion.*/
import java.util.*;
class NthTermAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first term (a):");
        int a = sc.nextInt();

        System.out.println("Enter common difference (d):");
        int d = sc.nextInt();

        System.out.println("Enter term number (n):");
        int n = sc.nextInt();

        int term = nthTerm(a, d, n);
        System.out.println("The " + n + "th term of the AP is: " + term);
    }

    // Recursive function to calculate nth term of AP
    public static int nthTerm(int a, int d, int n) {
        if (n == 1) {
            return a; // base case (1st term = a)
        }
        return nthTerm(a, d, n - 1) + d;
    }
}
