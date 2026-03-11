/*
Q5.Write a program to remove all spaces from a given string. 
Input: Java Programming Language 
Output: JavaProgrammingLanguage */

import java.util.*;
class RemoveSpace{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		
		String str="Java Programming Language";
		
		/*String[]words=str.split(" ");
		
		for(String word:words){
			System.out.print(word);
		}*/
		
		/*for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);	
			if(ch!=' '){
				System.out.print(ch);
			}																							
		}*/
		
		System.out.println(str.replace(" ",""));
	}
}