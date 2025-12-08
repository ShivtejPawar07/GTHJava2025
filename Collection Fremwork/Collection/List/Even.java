/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
import java.util.*;

class ListDemo {
    public static void main(String[] x) {
        int[] a = {1, 2, 3, 4};

        ArrayList<Integer> al = new ArrayList<>();

        // Convert array to ArrayList
        for (int n : a) {
            al.add(n); // auto-boxing to Integer
        }

        // Remove even numbers using Iterator
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            int value = itr.next();
            if (value % 2 == 0) {
                itr.remove();  // correct way to remove
            }
        }

        System.out.println(al); // Output: [1, 3]
    }
}
