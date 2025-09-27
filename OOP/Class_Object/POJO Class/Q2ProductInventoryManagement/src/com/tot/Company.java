package com.tot;

import java.util.Scanner;

public class Company {
	Scanner sc=new Scanner(System.in);
	
	Product[] p;
	public void accept(Product...p) {
		this.p=p;
	}
	public void addProduct() {
		for(int i=0;i<p.length;i++) {
			System.out.println("Enter Product Id,name,category,price,qty");
			int id=sc.nextInt();
			String n=sc.next();
			String c=sc.next();
			int pri=sc.nextInt();
			int qty=sc.nextInt();
			
			
			p[i]=new Product(id,n,c,pri,qty);
			System.out.println("Employee added succesfully....!");
		}
	}
	public void displayProduct() {
		for(int i=0;i<p.length;i++) {
			System.out.println("Display Product Info");
			System.out.println("Id="+p[i].getId());
			System.out.println("Name="+p[i].getName());
			System.out.println("Category="+p[i].getCategory());
			System.out.println("Price="+p[i].getPrice());
			System.out.println("Qty="+p[i].getQty());
			System.out.println("-------------------------------------------------");
		}
	}
	public void searchProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("3. Search Product");
		System.out.println("   1. Id");
		System.out.println("   2. Name");
	    System.out.print("Enter your choice: ");
	    int ch = sc.nextInt();

	    switch (ch) {
	        case 1:
	           
	            break;
	        case 2:
	            
	            break;
	        default:
	            System.out.println("Invalid choice!");
	    }
	}
	public void 
}
