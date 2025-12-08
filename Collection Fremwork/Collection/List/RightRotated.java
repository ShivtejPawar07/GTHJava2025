/*Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/
import java.util.*;

class RightRotated {
    public static void main(String[] x) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2;

        // Normalize k
        k = k % list.size();

        ArrayList<Integer> result = new ArrayList<>();

        // Add last k elements first
        for (int i = list.size() - k; i < list.size(); i++) {
            result.add(list.get(i));
        }

        // Add the remaining elements
        for (int i = 0; i < list.size() - k; i++) {
            result.add(list.get(i));
        }

        System.out.println("Original List : " + list);//1 2 3 4 5 
        System.out.println("After Right Rotation by " + k + " : " + result);//4 5 1 2 3
    }
}
