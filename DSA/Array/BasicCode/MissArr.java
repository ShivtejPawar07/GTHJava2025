/* Q5. Find missing elements in an ascending array */
import java.util.*;

class MissingElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int a[] = new int[n];

        System.out.println("Enter 5 elements in ascending order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nMissing elements:");
        for (int i = 0; i < n - 1; i++) {
            // Check numbers between a[i] and a[i+1]
            for (int j = a[i] + 1; j < a[i + 1]; j++) {
                System.out.print(j + "\t");
            }
        }
    }
}
