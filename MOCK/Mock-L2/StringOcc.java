/*
Q6. Write a program to remove duplicate characters from a string while keeping the first occurrence. 
Input: programming 
Output: progamin */

class StringOcc{
	public static void main(String[]x){
		String str="programming";
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			boolean flag=true;
			for(int j=0;j<i;j++){
				char ch2=str.charAt(j);
				if(ch==ch2){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.print(ch);
			}
		}
	}
}