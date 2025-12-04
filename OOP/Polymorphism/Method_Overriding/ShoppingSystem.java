import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getFinalPrice() {
        return price; // default no discount
    }

    double getDiscountAmount() {
        return price - getFinalPrice();
    }
}

// --------------------------------------------------

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double getFinalPrice() {
        if (price > 20000) {
            return price * 0.82; // 18% discount
        } else {
            return price * 0.90; // 10% discount
        }
    }
}

// --------------------------------------------------

class Clothing extends Product {
    boolean seasonalSale;

    Clothing(String name, double price, boolean seasonalSale) {
        super(name, price);
        this.seasonalSale = seasonalSale;
    }

    @Override
    double getFinalPrice() {
        if (seasonalSale) {
            return price * 0.70; // 30% off
        } else {
            return price * 0.95; // 5% off
        }
    }
}

// --------------------------------------------------

class Groceries extends Product {
    boolean member;

    Groceries(String name, double price, boolean member) {
        super(name, price);
        this.member = member;
    }

    @Override
    double getFinalPrice() {
        if (member) {
            return price * 0.97; // 3% off
        }
        return price; // no discount
    }
}

// --------------------------------------------------

public class ShoppingSystem {
    public static void main(String[] args) {

        Product[] items = new Product[15];

        items[0] = new Electronics("Laptop", 55000);
        items[1] = new Electronics("Headphones", 3000);
        items[2] = new Electronics("TV", 25000);

        items[3] = new Clothing("Shirt", 1500, true);
        items[4] = new Clothing("Jeans", 1800, false);
        items[5] = new Clothing("Jacket", 5000, true);

        items[6] = new Groceries("Rice", 1200, true);
        items[7] = new Groceries("Oil", 900, false);
        items[8] = new Groceries("Fruits", 600, true);

        items[9]  = new Electronics("Camera", 40000);
        items[10] = new Clothing("T-Shirt", 800, false);
        items[11] = new Groceries("Milk Pack", 60, false);

        items[12] = new Electronics("Smartphone", 22000);
        items[13] = new Clothing("Saree", 2500, true);
        items[14] = new Groceries("Vegetables", 500, true);

        // -----------------------------------------------------
        // FIND MINIMUM FINAL PRICE
        Product minItem = items[0];
        for (Product p : items) {
            if (p.getFinalPrice() < minItem.getFinalPrice()) {
                minItem = p;
            }
        }

        // -----------------------------------------------------
        // TOTAL BILL
        double total = 0;
        for (Product p : items) {
            total += p.getFinalPrice();
        }

        // -----------------------------------------------------
        // ITEMS WHERE DISCOUNT > 1000
        System.out.println("=== ITEMS WITH DISCOUNT > 1000 ===");
        for (Product p : items) {
            if (p.getDiscountAmount() > 1000) {
                System.out.println(p.name + " → Discount: " + p.getDiscountAmount());
            }
        }

        // -----------------------------------------------------
        System.out.println("\n=== ITEM WITH MINIMUM FINAL PRICE ===");
        System.out.println(minItem.name + " → Final Price: " + minItem.getFinalPrice());

        System.out.println("\n=== TOTAL BILL OF ALL ITEMS ===");
        System.out.println("Total: " + total);
    }
}
