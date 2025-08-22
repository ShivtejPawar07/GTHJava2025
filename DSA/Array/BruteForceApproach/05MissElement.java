/*5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/
import java.util.*;
class MissElement{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Element in an array");
		int n=sc.nextInt();
		int a[]=new int[n-1];
		System.out.println("Enter Array"+(n-1)+"Elemnt");
		int sum=0;
		for(int i=0;i<n-1;i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		int totalsum=n*(n+1)/2;
		int missing=totalsum-sum;
		System.out.println("Missing Element="+missing);
	}
	
}