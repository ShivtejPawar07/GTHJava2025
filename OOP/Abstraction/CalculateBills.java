import java.util.*;

abstract class Customer {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateBill(int units);
}

interface Discountable {
    double applyDiscount(double bill);
}

// ---------------- RESIDENTIAL ---------------------
class ResidentialCustomer extends Customer implements Discountable {
    ResidentialCustomer(int id, String name) {
        super(id, name);
    }

    double calculateBill(int units) {
        return units * 5;
    }

    public double applyDiscount(double bill) {
        return bill * 0.05;  // 5% discount
    }
}

// ---------------- COMMERCIAL ---------------------
class CommercialCustomer extends Customer implements Discountable {
    CommercialCustomer(int id, String name) {
        super(id, name);
    }

    double calculateBill(int units) {
        return units * 8;   // 8₹ per unit
    }

    public double applyDiscount(double bill) {
        return bill * 0.08; // 8% discount
    }
}

// ---------------- INDUSTRIAL ---------------------
class IndustrialCustomer extends Customer {
    IndustrialCustomer(int id, String name) {
        super(id, name);
    }

    double calculateBill(int units) {
        if (units <= 100)
            return units * 10;
        else
            return 100 * 10 + (units - 100) * 12;
    }
}

// ---------------- MAIN CLASS ---------------------
class CalculateBills {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Type (1-Residential, 2-Commercial, 3-Industrial): ");
        int type = sc.nextInt();

        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();

        System.out.println("Enter Customer Name: ");
        String name = sc.next();

        System.out.println("Enter Units: ");
        int units = sc.nextInt();

        Customer c = null;
        Discountable d = null;

        // Create correct object
        if (type == 1) {
            c = new ResidentialCustomer(id, name);
            d = (Discountable) c;
        } else if (type == 2) {
            c = new CommercialCustomer(id, name);
            d = (Discountable) c;
        } else if (type == 3) {
            c = new IndustrialCustomer(id, name); // No discount
        } else {
            System.out.println("Invalid Type!");
            return;
        }

        // Calculate bill
        double bill = c.calculateBill(units);

        double discount = 0;
        if (d != null) {
            discount = d.applyDiscount(bill);
        }

        double finalBill = bill - discount;

        System.out.println("------------------------------");
        System.out.println("Customer: " + name);
        System.out.println("Bill before discount: ₹" + bill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Bill: ₹" + finalBill);
    }
}
