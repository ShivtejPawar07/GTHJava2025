/*
Q5Longest Substring Without Repeating Characters
Return the length of the longest substring with all unique characters.
*/
import java.util.Scanner;
public class LongestSubString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char a[] = str.toCharArray();

			boolean seen[] = new boolean[256];
			int left = 0,right=0,len=0,max=0;
			while(right<a.length){
				if(seen[a[right]]==false){
					seen[a[right]] = true;
					right++;
					len = right-left;
				}else{
					seen[a[left]] = false;
					left++;
				}
				
				if(max<len)
					max = len;
			}
			System.out.printf("%d",max);
	}
}