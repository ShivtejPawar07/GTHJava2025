/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		 boolean flag = false;
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					for(int k=j+1;k<a.length;k++){
						if(a[i]+a[j]+a[k]==0){
						System.out.println("["+a[i]+" "+a[j]+" "+a[k]+"]");
						flag=true;
						}
					}
				}
			}
			if(!flag)
				System.out.println("No Triplets with Zero Sum");
		   

	}
}