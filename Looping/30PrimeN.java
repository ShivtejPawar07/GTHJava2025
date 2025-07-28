/*Q30. Write a java program to display 1 to nth Prime Number.
*/
import java.util.*;

public class Prime {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt(); // user input//100

        int num = 2; // Prime numbers start from 2

        while (num <= n) {//100<=2
            boolean isPrime = true;
            int i = 2;

            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // not prime, no need to check further
                }
                i++;
            }

            if (isPrime) {
                System.out.print(num + " ");
            }

            num++;
        }
    }
}
