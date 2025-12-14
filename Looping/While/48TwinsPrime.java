/*Q48. Write a Java program to display all Twin Primes between 1 and n.
 Twin Primes are pairs of prime numbers that differ by 2.
 Example: (3, 5), (5, 7), (11, 13).
Explanation:
 Use loops:
First, loop through numbers from 2 to n.
For each, check if it and the next number +2 are both prime using an inner loop.
If both are prime, print the pair.
*/
import java.util.*;

class TwinPrimes {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit:");
        int limit = sc.nextInt();

        for (int n = 3; n + 2 <= limit; n++) {

            boolean f1 = true, f2 = true;

            // check n is prime
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    f1 = false;
                    break;
                }
            }

            // check n+2 is prime
            for (int i = 2; i <= (n + 2) / 2; i++) {
                if ((n + 2) % i == 0) {
                    f2 = false;
                    break;
                }
            }

            if (f1 && f2) {
                System.out.print("(" + n + ", " + (n + 2) + ") ");
            }
        }
    }
}


