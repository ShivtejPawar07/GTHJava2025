/* **1. ATM PIN Validation**

**Description:**
Write a program that:

* Asks the user for a 4-digit ATM PIN.
* Gives **max 3 attempts** to enter the correct PIN using a do-while loop.
* If the PIN is correct, print "Access Granted" and **break** the loop.
* If attempts are over, print "Card Blocked".
*/
import java.util.*;
class Atm{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int i=3;
		
		do{
			System.out.println("Enter 4-digit ATM PIN");
			int n=sc.nextInt();
			int pin=7757;
			
			if(pin==n){
				System.out.println("Access Granted");
				break;
			}
			else{
				System.out.println("Invalid Pin"+" "+(i-1)+" "+"Chance Reamainimg");				
			}
			i--;
		}while(i>=1);	
		
		if(i==0){
			System.out.println("Card Blocked");
		}
		
		
		
		
		
	}
}