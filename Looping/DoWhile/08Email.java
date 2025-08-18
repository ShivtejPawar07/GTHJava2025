/* **8. Email Address Validator**

**Description:**

* Ask the user for an email address.
* If email doesn’t contain '@', **continue** to ask again.
* If user enters "cancel", **break**.
* Use a do-while loop to validate and accept only proper emails.

---
*/
import java.util.*;
class Email{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter Mail");
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("Cancel")){
				System.out.println("thank you");
				break;
			}
			int cnt=0;
			  for (int i=0; i<s.length(); i++){
				if(s.charAt(i)=='@'){
					cnt++;
				}
				if(s.charAt(i)==' '){
					cnt=-1;
					break;
				}	
			}
			if (cnt != 1 || s.startsWith("@") || s.endsWith("@")) {
                System.out.println("Invalid Email! Try again.");
                continue;
            }
            System.out.println("Valid Email");
			
		}while(true);
	}
}