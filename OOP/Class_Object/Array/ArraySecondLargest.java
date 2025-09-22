/*Q11. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.
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
	int findSecondLargest(int arr[]){
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				smax=max;
				max=arr[i];
			}
			else if(smax<arr[i] && max!=arr[i]){
				smax=arr[i];
			}
		}
		return smax;
	}
}
class ArraySecondLargest{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		
		System.out.println("Second Largest="+am.findSecondLargest(arr));
	}
}