package com.tot;

public class CompnyProfit {
	Company[] com;
	public CompnyProfit(Company...com){
		this.com=com;
	}
	public void show() {
        for(int i=0;i<com.length;i++) {
        System.out.println("Company: " + com[i].getCompanyName());
        System.out.println("Revenue: " + com[i].getRevenue());
        System.out.println("Expenses: " + com[i].getExpenses());
        System.out.println("Profit: " + (com[i].getRevenue()-com[i].getExpenses()));
        }
	}
}
