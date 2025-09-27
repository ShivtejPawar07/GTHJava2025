package com.tot;

public class BankDeposite {
	BankAccount ba;
	public void accept(BankAccount ba) {
		this.ba=ba;
	}
	public void show() {
		int obal=0;
		System.out.println("Name="+ba.getName());
		System.out.println("Current Balance="+obal);
		System.out.println("Updated Balance="+(obal+ba.getBalance()));
	}
}
