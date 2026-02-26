/*4
️) First Unique Character in a String 
Given a string s, return the first non-repeating character. 
If none exists, return _. 
Example 
Input: "leetcode" → "l" 
Input: "aabb" → "_" */

class FirstUniqueChar{
	public static void main(String[]x){
		String s=("leetcode");
		int[]freq=new int[26];
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			freq[ch-'a']++;
		}
		char result='-';
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(freq[ch - 'a'] == 1){
				result=ch;
			
			break;
			}
		}
		 System.out.println(result);
	}
}