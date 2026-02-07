/* Q10. Write a Java program that reads a sentence from the user and counts the frequency of each 
word using a HashMap.  
The program should:  
• Accept a sentence as input.  
• Split the sentence into words.  
• Use a HashMap to count how many times each word appears.  
• Display each word and its frequency.  
Input : Java is easy and Java is powerful  
Output : Word Frequencies: Java: 2 is: 2 easy: 1 and: 1 powerful: 1 */

import java.util.*;

class HashMapApp {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String s = sc.nextLine();
		String[] words = s.split(" "); 
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (hm.get(words[i]) == null) 
				hm.put(words[i], 1); 
			else 
				hm.put(words[i], hm.get(words[i]) + 1); 
		} 
		System.out.println("Word Frequencies:"); 
		for (String key : hm.keySet()) {
				System.out.println(key + ": " + hm.get(key));
		}
    }
}


