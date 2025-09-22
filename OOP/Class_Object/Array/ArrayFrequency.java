/*Q10. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.
*/
import java.util.*;
class Array{
	void inputArray(int arr[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elemnt");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	}
	void countFrequency(int arr[]){
		System.out.println("Element" + "\t\t" + "Count");
		boolean visited[]=new boolean[n];
		for(int i=0;i<arr.length;i++){
			if(visited[i]==true){
				continue;
			}
			int cnt=1;
			for(int j=i+1;j<arr.length;j++){
				if(a[i]==a[j]){
					cnt++;
					visited[j]=true;
				}
			}
			System.out.println(a[i] + "\t\t" + cnt);
		}
	}
}
class ArrayFrequency{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		am.countFrequency(arr);		
	}
}