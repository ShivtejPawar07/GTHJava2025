/*Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/
import java.util.*;

class FrequencyCount {
    public static void main(String[] x) {

        // 1. Integer array with repeated values
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        // 2. Convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }

        // 3. Another ArrayList to track visited elements
        ArrayList<Integer> visited = new ArrayList<>();

        // 4. Count frequency
        for (int i = 0; i < list.size(); i++) {

            int current = list.get(i);

            // Skip if already counted
            if (visited.contains(current))
                continue;

            int count = 0;

            // Count occurrences
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == current) {
                    count++;
                }
            }

            // Mark as visited
            visited.add(current);

            // Print frequency
            System.out.println(current + " → " + count);
        }
    }
}