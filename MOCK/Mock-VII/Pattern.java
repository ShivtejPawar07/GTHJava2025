/*
A      A
AB    BA
ABC  CBA
ABCDDCBA
ABC  CBA
AB    BA
A      A
*/

class Pattern{
	public static void main(String[]x){
		for(int i=1;i<=7;i++){
			for(int j=1,ch=65;j<=8;j++){
				if(((j<=i || j>=9-i) && i<=4 )||((j<=8-i || j>=i+1) && i>4)){
					if(j<5)
						System.out.print((char)ch++);
					else
						System.out.print((char)--ch);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}