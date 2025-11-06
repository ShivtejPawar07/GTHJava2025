/* 13. Find the union of two sorted arrays using two pointers. */
import java.util.*;

class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many elements in array 1:");
        int n1 = sc.nextInt();
        int a[] = new int[n1];

        System.out.println("Enter array elements of array a:");
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter how many elements in array 2:");
        int n2 = sc.nextInt();
        int b[] = new int[n2];

        System.out.println("Enter array elements of array b:");
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        // Sort both arrays to apply two-pointer approach
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("\nUnion of Array:");
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < n1 && j < n2) {
            // Skip duplicates in a[]
            while (i > 0 && i < n1 && a[i] == a[i - 1])
                i++;
            // Skip duplicates in b[]
            while (j > 0 && j < n2 && b[j] == b[j - 1])
                j++;

            if (i >= n1 || j >= n2)
                break;

            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (b[j] < a[i]) {
                System.out.print(b[j] + " ");
                j++;
            } else { // a[i] == b[j]
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        // Print remaining elements of a[]
        while (i < n1) {
            if (i == 0 || a[i] != a[i - 1])
                System.out.print(a[i] + " ");
            i++;
        }

        // Print remaining elements of b[]
        while (j < n2) {
            if (j == 0 || b[j] != b[j - 1])
                System.out.print(b[j] + " ");
            j++;
        }
    }
}
