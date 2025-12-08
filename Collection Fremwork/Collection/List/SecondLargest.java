/*Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/
import java.util.*;

class SecondLargest {
    public static void main(String[] x) {

        // 1. Integer array
        int[] arr = {10, 20, 5, 30, 25, 30};

        // 2. Convert array to Vector
        Vector<Integer> v = new Vector<>();
        for (int n : arr) {
            v.add(n);
        }

        System.out.println("Vector: " + v);

        // 3. Variables for max and second max
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // 4. Single-pass logic
        for (int i = 0; i < v.size(); i++) {
            int current = v.get(i);

            if (current > max) {
                secondMax = max;   // shift old max
                max = current;     // update max
            } 
            else if (current > secondMax && current != max) {
                secondMax = current;
            }
        }

        System.out.println("Second Largest Number: " + secondMax);
    }
}

