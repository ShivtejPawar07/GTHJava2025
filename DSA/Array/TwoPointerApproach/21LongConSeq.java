import java.util.*;
class LongConSeq {
    public static void main(String[] args) {
        int[] a = {49, 1, 3, 200, 2, 4, 70, 5};

        Arrays.sort(a);  // Step 1: Sort the array
        int longest = 1; // Step 2: To store maximum consecutive count
        int current = 1; // Step 3: To count current consecutive numbers

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1) {
                // Step 4: If current number is just 1 more than previous number
                // Example: 2 after 1, 3 after 2, etc.
                current++; // Increase count
            } else if (a[i] != a[i - 1]) {
                // Step 5: If numbers are not consecutive and not equal
                current = 1; // Start a new count
            }

            // Step 6: Keep track of the biggest consecutive chain found
            longest = Math.max(longest, current);
        }

        System.out.println("Longest consecutive sequence length = " + longest);
    }
}
