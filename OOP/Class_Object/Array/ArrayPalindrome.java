/*Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].*/
import java.util.*;
class Array{
	int arr[];
	void setArray(int arr[]){
		this.arr=arr;
	}
	boolean isPalindrome(int arr[]){
		for(int i=0;i<arr.length/2;i++){
			if(arr[i]!=arr[arr.length-i-1]){
				return false;
			}
		}
		return true;
	}
}
class ArrayPalindrome{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter array elemnt");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		
		Array am=new Array();
		am.setArray(arr);
		if(am.isPalindrome(arr))
			System.out.println("Array is Palindrome");
		else
			System.out.println("Array is Not Palindrome");
			
	}
}