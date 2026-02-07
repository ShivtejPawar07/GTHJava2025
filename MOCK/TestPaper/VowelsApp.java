/*.4 Write a Java program to find and display the vowels present in each word of a given string. 
Example: 
Input: 
String = "Java Programming Language" 
Output: 
Java → a, a 
Programming → o, a, i 
Language → a, u, a, e */

class VowelsApp{
	public static void main(String[]x){
		String s="Java Programming Language";
		System.out.println(s);
		String[]words=s.split(" ");
		for(String word:words){
			System.out.print(word+"->");
			
			boolean flag=false;
			for(int i=0;i<word.length();i++){
				char ch=Character.toLowerCase(word.charAt(i));
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o'||ch=='u'){
					System.out.print(ch + ", ");
					flag=true;
				}
			}
			if(!flag)
			System.out.print("Not found vowels");
			System.out.println();
		}
		
	}
}