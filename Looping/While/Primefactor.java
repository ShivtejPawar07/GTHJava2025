/*PrimeFactorSimple*/
import java.util.*;

class PrimeFactorSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Prime factors:");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {   // check divisibility
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
}