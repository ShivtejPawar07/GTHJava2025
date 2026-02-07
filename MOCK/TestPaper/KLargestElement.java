/*Q1. Given an integer array nums and an integer k, return the kth largest element in the array. 
Note that it is the kth largest element in the sorted order, not the kth distinct element. 
Can you solve it without sorting? 
  
Example 1: 
Input: nums = [3,2,1,5,6,4], k = 2 
Output: 5 
Example 2: 
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 
Output: 4*/
import java.util.*;
class KLargestElement{
	public static void main(String[]x){
		int[]nums={3,2,1,5,6,4};
		int k=2;
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		for(int num:nums){
			pq.add(num);
			if(pq.size()>k){
				pq.poll();//// remove smallest//remove extra smallest number
			}
			
		}
		System.out.println(k+"th largest Element="+pq.peek());//kth largest
	}
}

