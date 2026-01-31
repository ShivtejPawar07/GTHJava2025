/*1. Two Sum (LC 1)
Description:
 Find indices of two numbers in an array that add up to a target.
Example:
 Input: [2,7,11,15], target = 9
 Output: [0,1]
Approach (HashMap):
Store number → index in a HashMap
For each element, check if target - num exists
Time: O(n)
*/
import java.util.*;

class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (map.containsKey(required)) {
                System.out.println(map.get(required) + " " + i);
                return;
            }

            map.put(nums[i], i);
        }
    }
}
/*

import java.util.*;
class TwoSum{
	public static void main(String[]x){
		HashMap<Integer,Integer> mp=new HashMap<>();
		mp.put(0,2);
		mp.put(1,7);
		mp.put(2,11);
		mp.put(3,15);
		
		System.out.println(mp);
		
		for(int i=0;i<mp.size();i++){
			for(int j=i+1;j<mp.size();j++){
				if(mp.get(i)+mp.get(j)==18){
					System.out.println(i+ " "+j);
				}
			}
		}
	}
}
*/