/*Q.3 Write a Java program to find the first occurrence and last occurrence of a given number 
in a sorted array using binary search. 
Input: 
Array = {1, 2, 2, 2, 3, 4, 5} 
Key = 2 
 
Output: 
First Occurrence = 1 
Last Occurrence = 3 */

import java.util.*;
class FirstLastOcc{
	public static void main(String[]x){
		int[]a={1,2,2,2,3,4,5};
		int k=2;
		int first=firstOcc(a,k);
		System.out.println("First Occurrence="+first);
		int last=lastOcc(a,k);
		System.out.println("First Occurrence="+last);
	}
	static int firstOcc(int[]a,int k){
		int l=0;
		int r=a.length-1;
		int index=-1;
		while(l<=r){
			int mid=(l+r)/2;
			
			if(a[mid]==k){
				index=mid;
				r=mid-1;
			}
			else if(k<a[mid]){
				r=mid-1;
			}
			else{
				l=mid+1;
			}
		}
		return index;
	}
	static int lastOcc(int[]a,int k){
		int index=-1;
		int l=0;
		int r=a.length-1;
		
		while(l<=r){
			int mid=(l+r)/2;
			if(a[mid]==k){
				index=mid;
				l=mid+1;
			}
			else if(k<a[mid]){
				l=mid+1;
			}
			else{
				r=mid+1;
			}
		}
		return index;
	}
}