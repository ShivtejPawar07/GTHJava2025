/*Q15.Find Intersection of Two Arrays
Class: ArrayIntersection
Functions:
void inputArrays(int arr1[], int arr2[])
void findIntersection()
Logic:
Compare elements of arr1 with arr2.
If common element found, print it (but avoid duplicates).
*/
import java.util.*;
class Array{
	void inputArray(int arr1[],int arr2[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array elemnt");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array elemnt");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
	}
	void findIntersection(int a[],int b[]){
		int i=0,j=0;
		while(i<a.length && j<a.length){
			if(a[i]<b[j]){
				i++;
			}
			else if(a[i]>b[j]){
				j++;
			}
			else{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
		}
	}
}
class ArrayIntersection{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an 1st array");
		int n1=sc.nextInt();
		System.out.println("How many elemnt in an 2nd array");
		int n2=sc.nextInt();
		
		int[]arr1=new int[n1];
		int[]arr2=new int[n2];
		
		
		Array am=new Array();
		am.inputArray(arr1,arr2);
		am.findIntersection(arr1,arr2);
		
	}
}