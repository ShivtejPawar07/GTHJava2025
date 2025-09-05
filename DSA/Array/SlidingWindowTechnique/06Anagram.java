/*
Count Occurrences of Anagram
Count how many times an anagram of a string appears in another string.
*/
import java.util.*;
public class AnagramOccurance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//cnt =1
		String str = sc.next();//
		String target = sc.next();
		char arr[] = str.toCharArray();
		int k = target.length();
		int low = 0;
		int high = k;
		int cnt = 0;	
		while(high <= arr.length){
			String sub = str.substring(low,high);
			char subArray[] = sub.toCharArray();
			System.out.printf("%s\n",sub);
			Arrays.sort(subArray);
			boolean flag = true;
			char subArrayTarget[] = target.toCharArray();   
			Arrays.sort(subArrayTarget);
			for(int i=0;i<subArray.length;i++){
				flag = true;
				if(subArray[i]!=subArrayTarget[i]){
					flag = false;
					break;
				}
			}
				if(flag)
					cnt++;	
			low++;
			high++;
		}
		System.out.printf("Count is:%d",cnt);
	}
}