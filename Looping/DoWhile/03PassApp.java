/*
**3. Password Strength Checker**

**Description:**

* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit.

*/
import java.util.*;
class Pass{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		String pass;
		do{
			System.out.println("Enter the password");
			pass=sc.nextLine();//shiv //quit
			
			if(pass.length()<6){
				if(pass.equalsIgnoreCase("quit")==false){ //quit=false
				System.out.println("Password Must be 6 Character");//..
				continue;
				}
			}
			else{
				System.out.println("Password Accepted");
				break;
			}
		}while(pass.equalsIgnoreCase("quit")==false);//quit=false
			
	}

}