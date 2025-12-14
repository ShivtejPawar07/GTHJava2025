/*Q1. Write a Java program to find the length of the longest consecutive elements

sequence from an unsorted array of integers.

51, Sample array: [49, 1, 3, 200, 2, 4, 70, 5] The longest consecutive elements sequence is [1, 2, 3, 4, therefore the program will return its length 5.
*/
// Program to find the length of the longest consecutive sequence
import java.util.*;

class LongConSeq {
    public static void main(String[] args) {
     //   int[] a = {49, 1, 3, 200, 2, 4, 70, 5};
        int[] a = {1,2,5,6,7,9,10,55,22,23,24,25};

        // Step 1: Sort the array
        Arrays.sort(a);

        int longest = 1; // To store the longest sequence length
        int count = 1;   // To count current sequence

        // Step 2: Check consecutive numbers
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] + 1) {
                // If next number is consecutive (ex: 1,2 or 2,3)
                count++;
            } else if (a[i] != a[i - 1]) {
                // If numbers are not consecutive
                count = 1;
            }
            // Step 3: Update longest sequence
            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest consecutive sequence length = " + longest);
    }
}
