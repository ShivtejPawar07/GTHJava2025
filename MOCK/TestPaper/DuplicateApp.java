/*3
️) Contains Duplicate 
Given an integer array nums, return true if any value appears at least twice. 
Example 
Input: [1,2,3,1] → true 
Input: [1,2,3,4] → false*/
import java.util.*;
class DuplicateApp{
	public static void main(String[]x){
		int[]a={1,2,3,4};
		
		HashSet<Integer>hs=new HashSet<>();
		for(int val:a){
			if(!hs.add(val)){
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
	}
}