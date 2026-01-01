/*14. Delete Duplicates (Sorted II)
Description:
Remove all nodes with duplicate values.
Example:
Input: 1→2→3→3→4→4→5
Output: 1→2→5
*/
import java.util.*;

class DeleteDuplicatesSortedII {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(5);

        System.out.println("Original List: " + ll);

       LinkedList<Integer>result=LinkedList<>();
		int i=0;
		while(i<=ll.size()){
			int cnt=1;
			while(i+1<=ll.size() && ll.get(i).equals(ll.get(i+1))){
				cnt++;
				i++;
			}
			if(cnt==1){
				result.add(ll.get(i));
			}
			i++;
		}
		System.out.println(result);
    }
}