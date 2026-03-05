/*
Q5. Write a java program to store words in an ArrayList. Print words that start and end with the 
same character. 
Input: [level, cat, radar, java, madam] 
Output : level , radar , madam 
Description: 
Traverse each word and compare first and last character manually using charAt(). */

import java.util.*;
class SLArr{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<>();
		System.out.println("Enter a String");
		sc.nextLine();
		for(int i=0;i<5;i++){
			al.add(sc.nextLine());
		}
		System.out.println(al);
		
		for(String str:al){
			char first=str.charAt(0);
			char last=str.charAt(str.length()-1);
				
			if(first==last){
				System.out.println(str);
			}	
		}
	}
}