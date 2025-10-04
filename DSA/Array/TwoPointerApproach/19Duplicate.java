/*Found Duplicate Array*/
import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] a = {4, 2, 4, 3, 4, 1, 3, 4, 5,6,7,3,2,4,5,2,5,4};

        Arrays.sort(a);  // Step 1: sort array
        System.out.println("Sorted array: " + Arrays.toString(a));

        int i = 0; // slow pointer

        System.out.print("Duplicate elements: ");
        boolean found = false;

        for (int j = 1; j < a.length; j++) { // fast pointer
            if (a[i] == a[j]) {  // found duplicate
                System.out.print(a[j] + " ");
                found = true;

                // skip all same elements to avoid printing duplicates multiple times
                while (j < a.length && a[i] == a[j]) {
                    j++;
                }

                // move i to the new unique element
                if (j < a.length) {
                    i = j;
                }
            } else {
                i = j; // move both pointers if no duplicate
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}
