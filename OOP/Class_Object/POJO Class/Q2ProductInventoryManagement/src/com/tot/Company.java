package com.tot;

import java.util.Scanner;

public class Company {
    Scanner sc = new Scanner(System.in);
    Product[] p;

    public void accept(Product... p) {
        this.p = p;
    }

    public void addProduct() {
        for (int i = 0; i < p.length; i++) {
            System.out.println("Enter Product Id, Name, Category, Price, Qty:");
            int id = sc.nextInt();
            String n = sc.next();
            String c = sc.next();
            int pri = sc.nextInt();
            int qty = sc.nextInt();

            p[i] = new Product(id, n, c, pri, qty);
            System.out.println("Product added successfully....!");
        }
    }

    public void displayProduct() {
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                System.out.println("Display Product Info");
                System.out.println("Id=" + p[i].getId());
                System.out.println("Name=" + p[i].getName());
                System.out.println("Category=" + p[i].getCategory());
                System.out.println("Price=" + p[i].getPrice());
                System.out.println("Qty=" + p[i].getQty());
                System.out.println("-------------------------------------------------");
            }
        }
    }

    public void searchProduct() {
        System.out.println("3. Search Product");
        System.out.println("   1. Id");
        System.out.println("   2. Name");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        Product pro = null;

        switch (ch) {
            case 1:
                System.out.println("Enter a search Id:");
                int sid = sc.nextInt();
                for (int i = 0; i < p.length; i++) {
                    if (p[i] != null && sid == p[i].getId()) {
                        pro = p[i];
                        break;
                    }
                }
                break;

            case 2:
                System.out.println("Enter a search Name:");
                String name = sc.next();
                for (int i = 0; i < p.length; i++) {
                    if (p[i] != null && p[i].getName().equalsIgnoreCase(name)) {
                        pro = p[i];
                        break;
                    }
                }
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        if (pro != null) {
            System.out.println("Product Found:");
            System.out.println("Id=" + pro.getId());
            System.out.println("Name=" + pro.getName());
            System.out.println("Category=" + pro.getCategory());
            System.out.println("Price=" + pro.getPrice());
            System.out.println("Qty=" + pro.getQty());
            System.out.println("-------------------------------------------------");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void productDelete() {
        System.out.println("4. Delete Product");
        System.out.println("   1. Category");
        System.out.println("   2. Price < 100");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        boolean found = false;

        switch (ch) {
            case 1:
                System.out.print("Enter Category: ");
                String cat = sc.next();
                for (int i = 0; i < p.length; i++) {
                    if (p[i] != null && p[i].getCategory().equalsIgnoreCase(cat)) {
                        p[i] = null;
                        System.out.println("Product deleted successfully by Category.");
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("No Product found with this Category.");
                break;

            case 2:
                for (int i = 0; i < p.length; i++) {
                    if (p[i] != null && p[i].getPrice() < 100) {
                        p[i] = null;
                        System.out.println("Product deleted successfully (Price < 100).");
                        found = true;
                    }
                }
                if (!found) System.out.println("No Product found with Price < 100.");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    public void productUpdate() {
        System.out.println("5. Update Product");
        System.out.println("   1. Id → update quantity.");
        System.out.println("   2. Name → update price.");
        System.out.print("Enter Your Choice: ");
        int ch = sc.nextInt();
        boolean updated = false;

        switch (ch) {
            case 1:
                System.out.print("Enter Product Id: ");
                int id = sc.nextInt();
                for (int i = 0; i < p.length; i++) {
                    if (p[i] != null && p[i].getId() == id) {
                        System.out.print("Enter new Quantity: ");
                        int qty = sc.nextInt();
                        p[i] = new Product(p[i].getId(),p[i].getName(),p[i].getCategory(),p[i].getPrice(),  // keep old price if updating quantity
                        	    qty                // new quantity
                        	);
                        System.out.println("Quantity updated successfully.");
                        updated = true;
                        break;
                    }
                }
                break;

            case 2:
                System.out.print("Enter Product Name: ");
                String name = sc.next();
                for (int i = 0; i < p.length; i++) {
                    if (p[i] != null && p[i].getName().equalsIgnoreCase(name)) {
                        System.out.print("Enter new Price: ");
                        int price = sc.nextInt();
                        p[i] = new Product(
                        	    p[i].getId(),
                        	    p[i].getName(),
                        	    p[i].getCategory(),
                        	    price,             // new price
                        	    p[i].getQty()      // keep old quantity
                        	);
                        System.out.println("Price updated successfully.");
                        updated = true;
                        break;
                    }
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        if (!updated) {
            System.out.println("Product not found for update.");
        }
    }

    public void sortProduct() {
        System.out.println("6. Sort Products:");
        System.out.println("   1. By Id ascending.");
        System.out.println("   2. By Price descending");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // By Id ascending
                for (int i = 0; i < p.length - 1; i++) {
                    for (int j = i + 1; j < p.length; j++) {
                        if (p[i] != null && p[j] != null && p[i].getId() > p[j].getId()) {
                            Product temp = p[i];
                            p[i] = p[j];
                            p[j] = temp;
                        }
                    }
                }
                System.out.println("Products sorted by Id ascending.");
                break;

            case 2: // By Price descending
                for (int i = 0; i < p.length - 1; i++) {
                    for (int j = i + 1; j < p.length; j++) {
                        if (p[i] != null && p[j] != null && p[i].getPrice() < p[j].getPrice()) {
                            Product temp = p[i];
                            p[i] = p[j];
                            p[j] = temp;
                        }
                    }
                }
                System.out.println("Products sorted by Price descending.");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    public void expProduct() {
        Product max = null;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                if (max == null || p[i].getPrice() > max.getPrice()) {
                    max = p[i];
                }
            }
        }

        if (max != null) {
            System.out.println("Most Expensive Product:");
            System.out.println("Id=" + max.getId());
            System.out.println("Name=" + max.getName());
            System.out.println("Category=" + max.getCategory());
            System.out.println("Price=" + max.getPrice());
            System.out.println("Qty=" + max.getQty());
            System.out.println("-------------------------------------------------");
        } else {
            System.out.println("No products available.");
        }
    }

    public void rangeProduct() {
        System.out.println("Products with Price between 1000 and 5000:");
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null && p[i].getPrice() >= 1000 && p[i].getPrice() <= 5000) {
                System.out.println("Id=" + p[i].getId());
                System.out.println("Name=" + p[i].getName());
                System.out.println("Category=" + p[i].getCategory());
                System.out.println("Price=" + p[i].getPrice());
                System.out.println("Qty=" + p[i].getQty());
                System.out.println("-------------------------------------------------");
            }
        }
    }
}
