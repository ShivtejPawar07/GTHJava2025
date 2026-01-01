/*12. Partition List
Description:
Partition around value x, keeping original order.
Example:
Input: 1→4→3→2→5→2, x=3
Output: 1→2→2→4→3→5
*/

import java.util.*;

class PartitionList {
    public static void main(String[] x) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(5);
        ll.add(2);

        int pivot = 3;

        System.out.println("Original List: " + ll);

        LinkedList<Integer> less = new LinkedList<>();
        LinkedList<Integer> greaterEqual = new LinkedList<>();

        for (int num : ll) {
            if (num < pivot) {
                less.add(num);
            } else {
                greaterEqual.add(num);
            }
        }

        // Merge both lists
        less.addAll(greaterEqual);

        System.out.println("Partitioned List: " + less);
    }
}
