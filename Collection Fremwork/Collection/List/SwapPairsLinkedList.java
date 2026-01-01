/*16. Swap Nodes in Pairs
Description:
Swap every two adjacent nodes.
Example:
Input: 1→2→3→4
Output: 2→1→4→3

*/

import java.util.*;

public class SwapPairsLinkedList {

    public static void swapPairs(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Before: " + list);
        swapPairs(list);
        System.out.println("After : " + list);
    }
}