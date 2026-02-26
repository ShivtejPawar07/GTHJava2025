/*9
️) Longest Consecutive Sequence 
Given an unsorted array, find the length of the longest consecutive elements sequence. 
Example 
Input: [100,4,200,1,3,2] → 4*/
import java.util.*;
class LongestConSeqApp{
	public static void main(String[]x){
		int[]a={100,4,200,1,3,2};
		
		Set<Integer>hs=new HashSet<>();
		
		for(int val:a){
			hs.add(val);
		}
		
		int longest=0;
		
		for(int num:hs){
			if(!hs.contains(num-1)){
				int currnum=num;
				int currlen=1;
				
				while(hs.contains(currnum+1)){
					currnum++;
					currlen++;
				}
				longest=Math.max(longest,currlen);
			}
			
		}
		 System.out.println("Longest Consecutive Length: " + longest);
	}
}