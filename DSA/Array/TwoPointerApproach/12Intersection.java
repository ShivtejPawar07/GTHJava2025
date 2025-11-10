/*Intersection*/
import java.util.*;
class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Enter 1st Array Elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 2nd Array Elements:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("\nDisplay 1st Array Elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nDisplay 2nd Array Elements:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("\n\nIntersection of Arrays:");
        int i = 0, j = 0;

        // Two-pointer method
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;

                // Skip duplicates
                while (i < a.length && a[i] == a[i - 1]) 
					i++;
                while (j < b.length && b[j] == b[j - 1]) 
					j++;
            }
        }
    }
}
