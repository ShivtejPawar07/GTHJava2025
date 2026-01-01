/*13. Rotate List
Description:
Rotate list right by k steps.
Example:
Input: 1→2→3→4→5, k=2
Output: 4→5→1→2→3
*/
import java.util.*;

class RotateList {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        int k = 2;

        System.out.println("Original List: " + ll);

        int n = ll.size();
        k = k % n;   // handle large k

        for (int i = 0; i < k; i++) {
            int last = ll.removeLast();
            ll.addFirst(last);
        }

        System.out.println("Rotated List: " + ll);
    }
}
