package com.tot;

public class Library {
	 private int accNo;
	 private String title;
	 private String author;
	 private double price;

	    // Constructor
	    public Library(int accNo, String title, String author, double price) {
	        this.accNo = accNo;
	        this.title = title;
            this.author = author;
            this.price = price;
		}

	    // Getter methods
	    public int getAccNo() {
	        return accNo;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }
}
