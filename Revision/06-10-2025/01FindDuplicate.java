/*Find duplicate*/
import java.util.*;

class Duplicates {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2,2,3,2,2,2,3,2,3, 4, 4,2,2,2,3,4,2,6,7,3,2, 5};
    
        Arrays.sort(a); // Sort array first
        System.out.print("Duplicate elements: ");

        boolean found = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.print(a[i] + " ");
                found = true;

                // Skip repeated duplicates (e.g., [1,1,1])
                while (i < a.length - 1 && a[i] == a[i + 1]) {
                    i++;
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }
    }
}
