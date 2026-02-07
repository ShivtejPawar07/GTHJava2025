/*Q4. Check if a String is a Valid Shuffle of Two Strings. 
Example: 
Input → str1 = "abc", str2 = "def", result = "dabecf" 
Output → Valid Shuffle 
*/
class ShuffleApp{
	static boolean isValidShuffle(String str1,String str2,String result){
		if(result.length()!=str1.length()+str2.length())
			return false;
		
		int i=0,j=0,k=0;
		
		while(k<result.length()){
			if(i<str1.length() && result.charAt(k)==str1.charAt(i)){
				i++;
			}
			else if(j<str2.length() && result.charAt(k)==str2.charAt(j)){
				j++;
			}
			else{
				return false;
			}
			k++;
		}
		return (i==str1.length() && j==str2.length());
	}
	public static void main(String[]x){
		String str1="abc";
		String str2="def";
		String result="dabecf";
		
		if(isValidShuffle(str1,str2,result))
			System.out.println("Valid Shuffle");
		else
			System.out.println("Not Valid Shuffle");
		
	}
}