/*6) Valid Anagram 
Given two strings s and t, return true if t is an anagram of s. 
Example 
Input: s="anagram", t="nagaram" → true
*/
import java.util.*;
class ValidAnagram{
	public static void main(String[]x){
		String s1="anagram";
		String s2="nagaram";
		
	/*	char[]ch1=s1.toCharArray();
		char[]ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(Arrays.equals(ch1,ch2));
		*/
		
		if(s1.length()!=s2.length()){
			System.out.println("False");
			return;
		}
		
		int[]freq=new int[26];
		
		for(int i=0;i<s1.length();i++){
			freq[s1.charAt(i)-'a']++;
			freq[s2.charAt(i)-'a']--;
		}
		
		for(int i=0;i<26;i++){
			if(freq[i]!=0){
				System.out.println("False");
				return;
			}
		}
		System.out.println("true");
	}
}

/*
🎯 What This Means

Earlier in the program:

We increased counts for characters in s1

We decreased counts for characters in s2

If both strings are anagrams:

👉 Every character count should cancel out
👉 All values in freq[] must become 0

🧠 Why Check for 0?

Example:

s1 = "anagram"
s2 = "nagaram"

After counting:

freq[a] = 0
freq[n] = 0
freq[g] = 0
freq[r] = 0
freq[m] = 0


All other letters = 0

So loop finishes → prints:

true

❌ If Not Anagram

Example:

s1 = "rat"
s2 = "car"


After counting:

freq[r] = 0
freq[a] = 0
freq[t] = 1
freq[c] = -1


Some values are NOT 0

So inside loop:

if (freq[i] != 0)


Condition becomes true → print:

false


And program stops.

🔥 Simple Meaning

This loop is checking:

"Did every letter cancel out properly?"

If yes → anagram
If no → not anagram

🧩 Why 26?

Because:

26 lowercase English letters (a–z)

✅ Simple Summary

If any count ≠ 0
→ strings are NOT anagrams

If all counts = 0
→ strings ARE anagrams

*/