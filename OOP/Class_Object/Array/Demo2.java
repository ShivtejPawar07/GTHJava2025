/*Q14. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target.

*/

import java.util.*;
class Array{
	int a[];
	int b[];
	void setArray(int a[],int b[]){
		this.a=a;
		this.b=b;
	}
	void findIntersection(int a[],int b[]){
		System.out.println("\nIntersection");
		
		int i=0,j=0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				i++;
			}
			else if(a[i]>b[j]){
				j++;
			}
			else if(a[i]==b[j]){
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			
		}
	}
	void findUnion(int a[],int b[]){
		System.out.println("\nUnion");
		int i=0,j=0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				System.out.print(a[i]+" ");
				i++;
			}
			else if(a[i]>b[j]){
				System.out.print(b[j]+" ");
				j++;
			}
			else if(a[i]==b[j]){
			    System.out.print(a[i]+" ");
				i++;
				j++;
			}
			
		}
		while(i<a.length){
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<b.length){
			System.out.print(b[j]+" ");
			j++;
		}
	}
}
class Demo2{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("How many Number in an 1st array");
	int n1=sc.nextInt();
	
	int[]arr1=new int[n1];
	
	System.out.println("Enter the array 1st  element");
	for(int i=0;i<n1;i++){
		arr1[i]=sc.nextInt();
	}
	System.out.println("How many Number in an 2nd array");
	int n2=sc.nextInt();
	
	int[]arr2=new int[n2];
	
	System.out.println("Enter the array 2nd element");
	for(int i=0;i<n2;i++){
		arr2[i]=sc.nextInt();
	}
	Array am=new Array();
	am.setArray(arr1,arr2);
	am.findIntersection(arr1,arr2);
	am.findUnion(arr1,arr2);
	}
}