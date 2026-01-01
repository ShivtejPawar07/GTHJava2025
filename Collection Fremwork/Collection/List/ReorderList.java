/*11.Reorder List
Description:
Reorder as: L1 → Ln → L2 → Ln-1 ...
Example:
Input: 1→2→3→4
Output: 1→4→2→3
*/
import java.util.*;
class ReorderList{
	public static void main(String[]x){
		LinkedList<Integer> ll=new LinkedList<>();
			ll.add(1);
			ll.add(2);
			ll.add(3);
			ll.add(4);
			ll.add(5);
			
			
			System.out.println(ll);
		
		LinkedList<Integer> result=new LinkedList<>();
		
		int i=0;
		int j=ll.size()-1;
		
		while(i<=j){
			if(i==j){
				result.add(ll.get(i));
			}
			else{
				result.add(ll.get(i));
				result.add(ll.get(j));
			}
			i++;
			j--;
		}
		System.out.println(result);	
	}
}
