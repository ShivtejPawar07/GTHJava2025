/*Q2. Write program to create class name as CheckChar with two functions
    void setChar(char ch): this function accept single character as input
    boolean checkChar(): this function can check character is alphabet or digit of special  symbol if
    character is alphabet or digit return true if character is digit then return false.
*/
import java.util.*;
class CheckChar{
	char ch;
	void setChar(char ch){
		this.ch=ch;
	}
	 boolean checkChar() {
        // Check if character is a letter (A-Z or a-z)
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            return true;
        // Check if character is a digit (0-9)
        else if (ch >= '0' && ch <= '9')
            return true;
        // Otherwise, it's a special symbol
        else
            return false;
    }
	public static void main(String xx[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char");
		char ch = sc.next().charAt(0);
		CheckChar cc=new CheckChar();
		cc.setChar(ch);
		  if (cc.checkChar())
            System.out.println("Character is alphabet or digit");
        else
            System.out.println("Character is special symbol");
		
	}
}