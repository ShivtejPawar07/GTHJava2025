/*1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.


*/
import java.util.*;
class MaxLenSubList{
	static int maxLenSubList(int[]nums,int k){
		ArrayList<Integer> al = new ArrayList<>();
		for(int val:nums){
			al.add(val);
		}
		System.out.println(al);
		
		int i=0,j=0,sum=0;
		int maxlen=Integer.MIN_VALUE;
		
		for(;j<al.size();j++){
			sum+=al.get(j);
			while(sum>k){
				sum-=al.get(i);
				i++;
			}
			maxlen=Math.max(maxlen,j-i+1);
		}
		return maxlen;
	}
	public static void main(String[]x){
		int[]a={2, 3, 1, 2, 4};
		int k=7;
		System.out.println(MaxLenSubList.maxLenSubList(a,k));
	}

}