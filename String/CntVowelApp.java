/*Write a Java method to count all vowels in a string. */
import java.util.*;
class CntVowelApp{
	public static void main(String[]x){
		String s="ShIvtej pawar i";
		int vcnt=0;
		int wcnt=0;
		int scnt=0;
		
		
		for(int i=0;i<s.length();i++){
			//char ch=s.charAt(i);
			char ch=Character.toLowerCase(s.charAt(i));
			if (ch >= 'a' && ch <= 'z') {   // only letters
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
					vcnt++;
				else 
					wcnt++;
			}
			else if(ch==' '){
				scnt++;
			}
		}
		System.out.println("Count of vowels="+vcnt);
		System.out.println("Count of words="+wcnt);
		System.out.println("Count of space="+scnt);
		
	}
}