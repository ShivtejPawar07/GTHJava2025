/*Q3. Reverse Each Word in a Sentence but Keep Word Order. 
Example: 
Input → "Java is fun" 
Output → "avaJ si nuf" */

class ReverseEachWord {
    public static void main(String[] args) {
		String s="Java is fun";
		String[]words=s.split(" ");
		String result="";
		for(String word:words){
			System.out.println(word);
			String rev="";
			for(int i=word.length()-1;i>=0;i--){
				rev=rev+word.charAt(i);
				System.out.println(rev);
			}
			result=result+rev+" ";
		}
		System.out.println(result.trim());
    }
}
