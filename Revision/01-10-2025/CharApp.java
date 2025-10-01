/*3. Write program to character from keyboard and check character is alphabet digit or special
symbols?
*/
import java.util.*;
class Char{
	public static void checkChar(char c){
		if(c>='A' && c<='Z' ||c>='a' && c<='z' )
			System.out.println("Character is alphabet");
		else if(c>='0' && c<='9')
			System.out.println("Character is digit");
		else
			System.out.println("Special Symbol");
		
	}
}
class CharApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Char");
		char c=sc.next().charAt(0);
		Char.checkChar(c);
	
	}
}