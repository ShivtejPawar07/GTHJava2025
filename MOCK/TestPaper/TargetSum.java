/*Given an array of integers nums and an integer target, return the indices of the two numbers 
such that they add up to the target. 
You may assume each input has exactly one solution, and you may not use the same element 
twice. 
Example 
Input: nums = [2,7,11,15], target = 9 
Output: [0,2]*/
import java.util.*;
class TargetSum{
	public static void main(String[]x){
		/*int[]a={2,11,7,15};
		int tar=9;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==tar){
					System.out.printf("[%d,%d]",i,j);
					return;
				}
			}
		}*/
	 int[] nums = {2,1, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int sum = target - nums[i];

            if (map.containsKey(sum)) {
                System.out.println("Indices: [" + map.get(sumt) + ", " + i + "]");
                return;
            }

            map.put(nums[i], i);
        }
	}
}