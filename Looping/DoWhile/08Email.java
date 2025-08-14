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
			if(s.contains("@")){
				System.out.println("Valid Email");
			}
			else{
				System.out.println("InValid Email");
			}
		}while(true);
		
	}
}