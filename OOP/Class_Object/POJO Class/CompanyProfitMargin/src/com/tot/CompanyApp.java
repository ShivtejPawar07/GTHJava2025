package com.tot;

public class CompanyApp {

	public static void main(String[] args) {
		Company c1 = new Company("TechCorp", 500000, 300000);
		Company c2 = new Company("TechCorp", 500000, 300000);
		CompnyProfit cp=new CompnyProfit(c1,c2);
		cp.show();
	}
}
