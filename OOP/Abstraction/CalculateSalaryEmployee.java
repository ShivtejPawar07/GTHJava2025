import java.util.*;
abstract class Employee {
    String name;
    int id;
    double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    abstract double calculateBonus();
}

interface Performance {
    int getRating();
}

// ---------------- Developer ----------------
class Developer extends Employee implements Performance {
    int rating;

    Developer(String name, int id, double baseSalary, int rating) {
        super(name, id, baseSalary);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    double calculateBonus() {
        return baseSalary * rating * 0.05;
    }
}

// ---------------- Manager ----------------
class Manager extends Employee implements Performance {
    int rating;

    Manager(String name, int id, double baseSalary, int rating) {
        super(name, id, baseSalary);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    double calculateBonus() {
        return baseSalary * rating * 0.08;
    }
}

// ---------------- SalesExecutive ----------------
class SalesExecutive extends Employee implements Performance {
    int rating;
    double sales;

    SalesExecutive(String name, int id, double baseSalary, int rating, double sales) {
        super(name, id, baseSalary);
        this.rating = rating;
        this.sales = sales;
    }

    public int getRating() {
        return rating;
    }

    double calculateBonus() {
        return (baseSalary * rating * 0.04) + (sales * 0.03);
    }
}

// ---------------- Main System ----------------
class CalculateSalaryEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Type: 1.Developer  2.Manager  3.SalesExecutive");
        int type = sc.nextInt();

        System.out.println("Enter Name, ID, Base Salary:");
        String name = sc.next();
        int id = sc.nextInt();
        double bs = sc.nextDouble();

        System.out.println("Enter Rating (1 to 5):");
        int rating = sc.nextInt();

        Employee e = null;

        if (type == 1) {
            e = new Developer(name, id, bs, rating);
        } 
        else if (type == 2) {
            e = new Manager(name, id, bs, rating);
        } 
        else if (type == 3) {
            System.out.println("Enter Total Sales:");
            double sales = sc.nextDouble();
            e = new SalesExecutive(name, id, bs, rating, sales);
        } 
        else {
            System.out.println("Invalid Type!");
            return;
        }

        double bonus = e.calculateBonus();
        double finalSalary = e.baseSalary + bonus;

        System.out.println("\n============= EMPLOYEE DETAILS =============");
        System.out.println("Name        : " + e.name);
        System.out.println("ID          : " + e.id);
        System.out.println("Base Salary : " + e.baseSalary);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Final Salary: " + finalSalary);
        System.out.println("============================================");
    }
}
