package com.tot;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount b=new BankAccount("Shivtej",1000);
		BankDeposite bd=new BankDeposite();
		bd.accept(b);
		bd.show();
		
	}

}
