/*Write a Java method to count all the words in a string.*/
class CntWord{
	public static void main(String[]x){
		String s="Shivtej Dipak Pawar";
		//String[]words=s.split(" ");
		int cnt = s.trim().split("\\s+").length;

		//int cnt=0;
		/*for(String word:words){
			cnt++;
		}*/
		System.out.println("Words Count="+cnt);
	}
}