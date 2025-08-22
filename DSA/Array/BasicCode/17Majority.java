/*Q17.  Write a java program to check majority element of array.
 The majority element of an array is defined as an element that 
 appears more than \(N/2\) times, where \(N\) is the total number
 of elements in the array. This means its frequency in the array 
 is strictly greater than half the array's size. 
*/
import java.util.*;
class array{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("limit:");
		int n=sc.nextInt();
		System.out.println("enter element:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int maj=0;
		for(int i=0;i<n;i++){
			int cnt=0;
			for(int j=0;j<n;j++){
				if(a[i]==a[j]){
					cnt++;
				}
			}
			if(cnt>n/2)//cnt>n/2
			{	
			maj=a[i];
			break;
			}
		}	
		if(maj!=0){
			System.out.println("majority"+maj);
		}
		else{
			System.out.println("nooo");
		}
	}
}