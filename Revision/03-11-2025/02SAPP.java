/*2.Search for an Element (Linear Search)
Concept: Traverse array linearly and compare each value with the target.
  
arr = [10, 20, 30, 40, 50]
Enter search key  : 30
Output: value found
Enter search key: 300
Output: value not found 
*/
import java.util.*;
class SAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elemmnt");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter a skey");
			int skey=sc.nextInt();
		
			int index=search(a,skey);
		
		if(index!=-1)
			System.out.println("elemmnt found"+index);
		else
			System.out.println("elemmnt not found");
		
	}
	static int search(int[] a,int skey){
		int index=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==skey){
				index=i;
				break;
			}
				
		}
		return index;
		
	}
}