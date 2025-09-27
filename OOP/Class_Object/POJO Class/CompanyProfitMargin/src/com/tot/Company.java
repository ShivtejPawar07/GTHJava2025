package com.tot;

public class Company {
	 private String companyName;
	    private double revenue;
	    private double expenses;

	    // Parameterized constructor
	    public Company(String companyName, double revenue, double expenses) {
	        this.companyName = companyName;
	        this.revenue = revenue;
	        this.expenses = expenses;
	    }
	    public String getCompanyName() {
	        return companyName;
	    }
	    public double getRevenue() {
	        return revenue;
	    }
	    public double getExpenses() {
	        return expenses;
	    }
}
