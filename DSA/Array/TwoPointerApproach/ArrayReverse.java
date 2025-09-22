/*Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray(int arr[])
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
	void reverseArray(int arr[]){
		boolean flag=true;
		for(int i=0;j=arr.length-1;i<j;i++,j--){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Display reverse array elemnt");
		for(int i=0;i<arr.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
class ArrayReverse{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		am.reverseArray(arr);		
	}
}