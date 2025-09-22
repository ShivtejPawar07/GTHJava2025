/*Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int arr[], int key)
Logic: Traverse array, check if key matches any element.
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
	boolean searchElement(int arr[], int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				return true;
		}
		return false;
	}
}
class ArraySearch{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		Array am=new Array();
		am.inputArray(arr);
		
		System.out.println("Enter the elemnt for search");
		int skey=sc.nextInt();
		
		if(am.searchElement(arr,skey))
			System.out.println(skey +" is Found");
		else
			System.out.println(skey +" is Not Found");
	}
}