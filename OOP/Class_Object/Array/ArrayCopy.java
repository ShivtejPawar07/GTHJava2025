/*Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray(int arr[])
Logic: Loop through source array and store elements into new array.
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
	int[] copyArray(int arr[]){
		int[]brr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			brr[i]=arr[i];
		}
		return brr;
	}
}
class ArrayCopy{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		
		Array am=new Array();
		am.inputArray(arr);
		
		int[]brr=am.copyArray(arr);
		
		System.out.println("DIsplay copy arry");
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+" ");
		}
	}
}