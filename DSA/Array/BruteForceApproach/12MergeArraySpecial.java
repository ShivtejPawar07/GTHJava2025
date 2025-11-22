// MergeArray.java
/* MergeArray class :-
Input -
First Array :- 1 2 3 4 5  
Second Array :- 6 7 8 9 10  
Output - 1 10 2 9 3 8 4 7 5 6
*/
import java.util.*;

class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n * 2];

        System.out.println("Enter elements of First Array (a):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of Second Array (b):");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Merge logic (1 from a start, 1 from b end)
        int k = 0;
        int j = n - 1; // start from end of second array (b)

        for (int i = 0; i < n; i++) {
            c[k++] = a[i];   // from start of a
            c[k++] = b[j--]; // from end of b
        }

        // Display merged array
        System.out.println("\nMerged Array (c):");
        for (int x : c) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
