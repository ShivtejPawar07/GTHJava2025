/*Q59. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
*/
import java.util.*;
class Atm{
  public static void main(String x[]){
	  
		  int ch;
		  do{
  Scanner sc=new Scanner(System.in);
  System.out.println("1 Deposit");
  System.out.println("2 Withdraw");
  System.out.println("3 Check Balance");
  System.out.println("4 Exit");
  System.out.println("enter your choice");
	 ch=sc.nextInt();
	
  int balance=0;
  System.out.println("Total Balanace:"+balance);
  switch(ch){
     case 1:
     System.out.println("Enter the deposite amount");
	 int dep=sc.nextInt();
	 System.out.println("Deposite Successfully");
	 balance+=dep;
	 System.out.println("Bank balance After Deposite:"+balance);
	break;
	 
	 case 2:
	 System.out.println("Enter the Withdraw amount");
	 int wd=sc.nextInt();
	   if(balance>=wd){
		   balance-=wd;
		    System.out.println("Withdraw Successfully");
		   
	   }
	   else{
		   System.out.println("Insufficient balance");
	   }
	
	 break;
	 case 3:
	 System.out.println("Bank balance:"+balance);
	  break;
	  case 4:
	 System.out.println("Thank you visit again:");
	  break;
	  default:
	  System.out.println("Invalid condition");
  }
	  }while(ch!=4);
}
}