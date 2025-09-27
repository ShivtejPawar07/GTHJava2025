package com.tot;

public class ShopApp {
	private Product p[];
	// Store products using varargs
	void addProducts(Product...p) {
		this.p=p;
	}
	// Return all products
    Product[] getProducts() {
        return p;
    }
    // // Calculate and display bill
	void calBill(Customer cust,Product...p) {
		double total = 0;

        System.out.println("========== BILL ==========");
        System.out.println("Customer ID: " + cust.getcId());
        System.out.println("Name       : " + cust.getcName());
        System.out.println("Email      : " + cust.getEmail());
        System.out.println("Contact    : " + cust.getContact());
        System.out.println("Address    : " + cust.getAdress());
        System.out.println("--------------------------");
        System.out.println("ID\tName\tQty\tRate\tCompany\tAmount");

        System.out.println("-------------------------------------------------------------");

        for (Product prod : p) {
            double amount = prod.getTotal();
            total += amount;
            System.out.println(prod.getpId() + "\t" + prod.getpName() + "\t" + prod.getQty() + 
                               "\t" + prod.getRate() + "\t" + prod.getCompName() + "\t" + amount);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total Bill:%f", total);
        System.out.println("===========================");
	}
}
