/*2. Remove Duplicates from Sorted Array
   Approach: Two Pointers (slow/fast)
   Example: arr = [1,1,2,2,3] → [1,2,3]
*/
import java.util.*;
class Duplicates{
	public static void main(String x[]){
		int[] a ={1,1,2,1,3,3,1,2,3,1,1,2,2,2,2,2,3};
		
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