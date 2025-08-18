/*11 Problem Statement:
 Write a menu-driven program using do-while and switch-case to perform operations on 
 a bank account balance (initial balance entered by user):
Deposit money.
Withdraw money (only if sufficient balance).
Check current balance.
Exit.
Program should repeatedly allow operations until exit.
*/
import java.util.*;
class Bank{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter bank account balance");
			int balance=sc.nextInt();
		do{
			
			
			
			System.out.println("1:Deposite");
			System.out.println("2:Withdraw");
			System.out.println("3:Current balance");
			System.out.println("4:Exit");
			System.out.println("Enter a choice");
			ch=sc.nextInt();
			
			switch(ch){
				case 1:
						System.out.println("Enter Deposite Amount");
						int deposite=sc.nextInt();
						
						if(deposite>0){
							
							System.out.println("Credited:"+deposite);
							System.out.println("Balance after Deposit = " + balance);
						}
						else{
							System.out.println("Invalid Deposite");
						}
					    
						
				break;
				case 2:
						System.out.println("Enter Withdraw Amount");
						int withdraw=sc.nextInt();
						
						if(withdraw>0 && balance>=withdraw){
							balance-=withdraw;
							System.out.println("Debited for"+withdraw);
							System.out.println("Balance after withdraw = " + balance);
						}
						else{
							System.out.println("Insufficient Balance");
						}
						
				break;
				case 3:
						System.out.println("Current Balance="+balance);
						
				break;
				case 4:
						System.out.println("Thank you Visit again");
				break;
				
				default:
				System.out.println("Invalid Choice");
			}
			
			
		}while(ch!=4);	
		
		
		
	}
}