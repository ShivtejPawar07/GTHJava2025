package com.tot;

public class BankAccount {
	private String name;
    private float balance;
    public  BankAccount(String name,float balance){
    	this.name=name;
    	this.balance=balance;
    }
    public String getName() {
    	return name;
    }
    public float getBalance() {
    	return balance;
    }
}
