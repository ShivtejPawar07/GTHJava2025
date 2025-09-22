/*Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven(int arr[])
int countOdd(int arr[])
Logic: Use % 2 == 0 check.
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
	int countEven(int arr[]){
		int ecnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				ecnt++;
		}
		return ecnt;
	}
	int countOdd(int arr[]){
		int ocnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				ocnt++;
		}
		return ocnt;
	}
}
class ArrayEvenOdd{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		
		System.out.println("Count Even Number is ="+am.countEven(arr));
		System.out.println("Count Odd Number is ="+am.countOdd(arr));
	}
}