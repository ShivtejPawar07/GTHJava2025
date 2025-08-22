/*3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int k=2;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
					if(a[i]-a[j]==k){
					System.out.println("["+a[i]+" "+a[j]+"]");
					}
					else if(a[i]<a[j]){
						if(a[j]-a[i]==k){
					System.out.println("["+a[i]+" "+a[j]+"]");
					}	
				}
			}
		}
	}
}