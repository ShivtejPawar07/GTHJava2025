/*17. Remove N-th Node from End
Description:
Remove node that is n positions from the end.
Example:
Input: 1→2→3→4→5, n=2
Output: 1→2→3→5
*/
import java.util.*;

public class RemoveNthFromEnd {

   /* public static void removeNthFromEnd(LinkedList<Integer> list, int n) {
        int size = list.size();
        int index = size - n;

        if (index >= 0 && index < size) {
            list.remove(index);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int n = 2;

        System.out.println("Before: " + list);
        removeNthFromEnd(list, n);
        System.out.println("After : " + list);
    }*/
	
	public static void main(String[]x){
		LinkedList<Integer>ll=new LinkedList<>();
			ll.add(1);
			ll.add(2);
			ll.add(3);
			ll.add(4);
			
			System.out.println(ll);
			int n=1;
			ll.remove(ll.size()-n);
			System.out.println(ll);
		
	}
}
