/*Q7. Write a Java program to implement binary search using function overloading. 
You must create two overloaded methods with the same name binarySearch() that perform 
different operations: 
 
int binarySearch(int[] arr, int key) 
• This method should perform normal binary search on a sorted array. 
• It should return the index of the key if found, otherwise return -1. 
    
    int binarySearch(int[] arr, int key, boolean first) 
• This overloaded method must find the first occurrence of the key using recursion. 
• If duplicates exist, it should return the leftmost index where the key appears. */

import java.util.*;
class BinarySearch{
	int binarySearch(int[] a, int skey){
		int l=0,r=a.length-1;
		int index=-1;
		for(int i=0;i<a.length;i++){
			int mid=l+(r-l)/2;
			if(a[mid]==skey){
				index=mid;
				break;
			}
			if(a[mid]<skey){
				l=mid+1;
			}
			else{
				r=mid-1;
			}
		}
		return index;	
	} 
	 int binarySearch(int[] arr, int key, boolean first) {
        return firstOcc(arr, key, 0, arr.length - 1);
    }

    int firstOcc(int[] arr, int key, int l, int r) {
        if (l > r)
            return -1;

        int mid = l + (r - l) / 2;

        if (arr[mid] == key) {
            int leftIndex = firstOcc(arr, key, l, mid - 1);
            return (leftIndex == -1) ? mid : leftIndex;
        }

        if (key < arr[mid])
            return firstOcc(arr, key, l, mid - 1);
        else
            return firstOcc(arr, key, mid + 1, r);
    }
}
class BinarySearchApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		int[]a=new int[5];
		System.out.println("Enter array element");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
			
		System.out.println("Enter a skey");
		int skey=sc.nextInt();
			
		BinarySearch bs=new BinarySearch();
		 // Normal Binary Search
        int index = bs.binarySearch(a, skey);
        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + index);

        // First Occurrence (Recursive)
        int firstIndex = bs.binarySearch(a, skey, true);
        System.out.println("First Occurrence index = " + firstIndex);
		
	}
}