/*Q3. Write program to create class name as CheckChar with two functions
 void setChar(char ch): this function accept single character as input
 boolean checkChar(): this function can check character is alphabet or digit of special symbol if
character is alphabet or digit return true if character is digit then return false.
*/
class CheckChar{
	char ch;
	void setChar(char ch){
		this.ch=ch;
	}
	boolean checkChar(){
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String x[]){
		char ch='4';
		CheckChar c=new CheckChar();
		c.setChar(ch);
		System.out.println(c.checkChar());
	}
}