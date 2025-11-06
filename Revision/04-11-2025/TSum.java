/*6.Find All Pairs with Given Sum
Concept: Use nested loops or two-pointer technique to check sums.
 Use Case: Match contributors, tasks, etc., that add up to a budget.
arr = [1, 5, 7, -1, 5]
Target sum (S) = 6
Example: Pairs with sum 6:
(5, 1)
(-1, 7)
(5, 1)
*/
import java.util.*;
class TSum{
	public static void main(String x[]){
		
		int[]a={ 2, 3, 5, 7, -7, 5, 8, -5};
		Arrays.sort(a);
		
		int sum=6;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum)
					System.out.printf("(%d,%d)\n",a[i],a[j]);
			}
		}
		
		
		
		
		
	}
	
}