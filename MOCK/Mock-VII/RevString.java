/*Q4. Store N strings in an ArrayList. Reverse each string manually and store in another Arraylist. 
Input: 3 
java 
code 
list 
Output : Reversed List: avaj edoc tsil 
Description: 
Traverse each string character by character in reverse order. Do not use StringBuilder reverse() 
or inbuilt reverse methods. */

import java.util.*;
class RevString{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<>();
		System.out.println("How many String");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a String");
		for(int i=0;i<n;i++){
			al.add(sc.nextLine());
		}
		System.out.println("Reversed a String");
		for(String str:al){
			String rev="";
			for(int i=str.length()-1;i>=0;i--){
				rev=rev+str.charAt(i);
			}
			System.out.println(rev);
		}
	}

}