/*4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
import java.util.*;
class Asc{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Elemnt in Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Elemnt in Array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<n;i++){
			//System.out.printf("a[%d]=%d\n",i,a[i]);
		System.out.println("a["+i+"]="+a[i]);
		}
		boolean flag=true;	
		for(int i=0;i<n-1;i++){
				if(a[i]>a[i+1]){
					flag=false;
					break;
				}
		}
        if(flag){
			System.out.println("true");
		}
	
	}
}