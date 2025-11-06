/*3.Count Frequency of Each Element
Concept: Use nested loops or a hash map to count how often each number appears.
 Example:  arr = [4, 5, 6, 4, 5, 7, 4]
Output:
Element 4 occurs 3 times 
Element 5 occurs 2 times 
Element 6 occurs 1 time 
Element 7 occurs 1 time  
*/
import java.util.*;
class FAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elemmnt");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		boolean visited[]=new boolean[5];
		
		for(int i=0;i<a.length;i++){
			if(visited[i]==true)
				continue;
			int cnt=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
				cnt++;
				visited[j]=true;
				break;
				}
			}
			System.out.println("Element"+ a[i] +"occurs"+ cnt +"times ");
		}
		
	}
}