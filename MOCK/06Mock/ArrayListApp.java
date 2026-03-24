/*Q9. Write a program using ArrayList to store exam marks of students. Take a number from the user 
and count how many times it appears in the list. 
Explanation: 
• Store marks in an ArrayList. 
• Traverse the list using a loop. 
• Compare each element with the user input and maintain a count. 
• Demonstrates searching and frequency counting using ArrayList.*/

import java.util.*;
class ArrayListApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>al=new ArrayList<>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			
		System.out.println(al);
		
		System.out.println("Enter a NUm");
		int n=sc.nextInt();
		int cnt=0;
		for(int val:al){
			if(val==n){
				cnt++;
			}
		}
		System.out.println(n + " appears " + cnt + " times.");
		
	}
}