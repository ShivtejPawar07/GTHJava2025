/*String rev*/;

class RevStringApp{
	public static void main(String[]x){
		String s="Shivtej Pawar";
		
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			System.out.print(ch);
		}
	}
}