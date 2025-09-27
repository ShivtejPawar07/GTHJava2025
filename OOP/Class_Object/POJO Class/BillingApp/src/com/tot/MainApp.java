package com.tot;
public class MainApp {
    public static void main(String[] args) {
        // Create an array of Product objects
        Product[] products = new Product[5];
        
        products[0] = new Product(101, "Laptop", 1, 55000, "Dell");
        products[1] = new Product(102, "Mouse", 2, 500, "Logitech");
        products[2] = new Product(103, "Keyboard", 1, 1200, "HP");
        products[3] = new Product(104, "Monitor", 1, 8000, "Samsung");
        products[4] = new Product(105, "Pen Drive", 3, 600, "SanDisk");

        // Create a customer
        Customer c1 = new Customer(1, "Shivtej Pawar", "shivtejpawar8@gmail.com", 
                                   "7757949545", "Sangamner");

        // Create shop
        ShopApp shop = new ShopApp();

        // Add products using array of objects with varargs
        shop.addProducts(products);

        // Print bill for customer using the same array
        shop.calBill(c1, products);
    }
}
