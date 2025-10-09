/*2. Remove Duplicates from Sorted Array
   Approach: Two Pointers (slow/fast)
   Example: arr = [1,1,2,2,3] → [1,2,3]
*/
import java.util.*;
class Duplicates{
	public static void main(String x[]){
		int[] a ={1,1,2,2,3};
		
		Arrays.sort(a);
		
		int i=0;
		for(int j=0;j<a.length;j++){
			if(a[i]!=a[j]){
				i++;
				a[i]=a[j];
			}
		}
		int nl=i+1;
		for(int j=0;j<nl;j++){
			System.out.print(a[j]+" ");
		}
	}
}
/*🔍 Step 1: Array after sorting

a = [1, 1, 2, 2, 3]
(It’s already sorted, so no change.)

🔁 Step 2: Loop Explanation (two-pointer logic)

| Iteration (j) | a[i] | a[j] | Condition a[i] != a[j] | Action | i | Array after action |
|----------------|------|------|---------------------------|--------|--------------------|
| 0 | 1 | 1 | ❌ No | nothing | 0 | [1,1,2,2,3] |
| 1 | 1 | 1 | ❌ No | nothing | 0 | [1,1,2,2,3] |
| 2 | 1 | 2 | ✅ Yes | i=1; a[1]=2; | 1 | [1,2,2,2,3] |
| 3 | 2 | 2 | ❌ No | nothing | 1 | [1,2,2,2,3] |
| 4 | 2 | 3 | ✅ Yes | i=2; a[2]=3; | 2 | [1,2,3,2,3] |

✅ After the loop:
i = 2 → nl = i + 1 = 3

So only first 3 elements are unique:

[1, 2, 3]*/