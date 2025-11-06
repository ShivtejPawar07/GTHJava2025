/*Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000
A parameterized constructor to initialize all fields
A method deposit() to add money
A method display() to show details.

Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
*/
import java.util.*;
class BankAccount{
	Scanner sc=new Scanner(System.in);
	int no;
	String name;
	int bal;
	BankAccount(){
		no = 0;
        name = "Unknown";
        bal = 1000; // default balance
	}
	BankAccount(int no,String name){
		this.no=no;
		this.name=name;
		this.bal = 1000; // default starting balance
	}
	void deposite(){
		System.out.println("Enter a Deposite amt=");
		int amt=sc.nextInt();
		bal+=amt;
		System.out.println("Amount deposited successfully!");
        System.out.println("Updated Balance: " + bal);
	}
	void display(){
		System.out.println("No="+no);
		System.out.println("Name="+name);
		System.out.println("bal="+bal);
	}
	public static void main(String x[]){
		BankAccount ba=new BankAccount();
		ba.display();
		ba.deposite();
		ba.display();
		BankAccount ba1=new BankAccount(1,"Shivtej");
		ba1.display();
		ba1.deposite();
		ba1.display();
	}
}