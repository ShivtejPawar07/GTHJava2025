package com.tot;
import java.util.*;
public class FoodOper {
	Food[] f;
	public void accept(Food...f) {
		this.f=f;
	}
	public void addFood() {
	    Scanner sc = new Scanner(System.in);

	    for (int i = 0; i < f.length; i++) {
	        System.out.println("Enter Food ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.println("Enter Food Name: ");
	        String name = sc.nextLine();

	        System.out.println("Enter Food Price: ");
	        double price = sc.nextDouble();
	        sc.nextLine(); // consume newline

	        System.out.println("Enter Food Category: ");
	        String category = sc.nextLine();

	        f[i] = new Food(id, name, price, category);
	        System.out.println("Food added successfully!");
	        System.out.println("--------------------------");
	    }
	}
	public void Display() {
	    System.out.println("Food Details:");
	    for (int i = 0; i < f.length; i++) {
	        if (f[i] != null) { // Check if the Food object exists
	            System.out.println("Food ID: " + f[i].getFid());
	            System.out.println("Food Name: " + f[i].getFname());
	            System.out.println("Price: " + f[i].getFprice());
	            System.out.println("Category: " + f[i].getFcategory());
	            System.out.println("-------------------------");
	        }
	    }
	}
	public void displayBillMenu() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("3 : Display Bill Details:");
	    System.out.println("    1 : Bill Without GST");
	    System.out.println("    2 : Bill With 18% GST");
	    System.out.print("Enter your choice: ");
	    int choice = sc.nextInt();

	    double total = 0;
	    for (int i = 0; i < f.length; i++) {
	        if (f[i] != null) {
	            total += f[i].getFprice();
	        }
	    }

	    switch (choice) {
	        case 1:
	            System.out.println("Bill Without GST: " + total);
	            break;
	        case 2:
	            double gst = total * 0.18; // 18% GST
	            System.out.println("Bill With 18% GST: " + (total + gst));
	            break;
	        default:
	            System.out.println("Invalid choice!");
	    }
	}


}
