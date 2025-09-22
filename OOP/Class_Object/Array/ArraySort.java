/*Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray(int arr[])
Logic: Use Bubble Sort / Selection Sort.
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
	void sortArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Display array Ascending");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
class ArraySort{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		am.sortArray(arr);		
	}
}