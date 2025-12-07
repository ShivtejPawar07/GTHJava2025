/*
Q5. Create a Vector of 10 integers (including negative numbers).
Remove all negative values and print the updated Vector.

Explanation:
Negative numbers are < 0.
Use a backward loop because removing elements while iterating forward changes indices.
*/

import java.util.*;

class RemoveApp {
    public static void main(String[] x) {

        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            v.add(sc.nextInt());
        }

        // Removing negative numbers using backward loop
        for (int i = v.size() - 1; i >= 0; i--) {
            if (v.get(i) < 0) {
                v.remove(i);
            }
        }

        // Printing updated vector
        System.out.println("Updated Vector (No negative numbers):");
        for (int num : v) {
            System.out.println(num);
        }

        sc.close();
    }
}
