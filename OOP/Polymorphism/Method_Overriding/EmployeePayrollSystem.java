/*Q2. Employee Payroll System – Multiple Child Classes
Create:
Parent class: Employee
Fields: id, name, baseSalary
 Method: calculateSalary()
Child classes:
Manager:
Allowance = 40% of baseSalary
Bonus = ₹10,000 if teamSize > 10
Developer:
Allowance = 30%
Extra pay = ₹2000 × numberOfProjects
Intern:
Stipend = 50% of baseSalary
Task:
Create an array of 10 employees (mix of all types).
Implement salary calculation using overrides.
Display:
Employee with maximum salary
Count how many employees earn above 60,000.
Concepts Used
Inheritance + overriding
Polymorphism with reference array
Logical operations for filtering and counting
*/
import java.util.*;

class Employee {
    int id;
    String name;
    float baseSalary;

    Employee(int id, String name, float baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    float calculateSalary() {
        return baseSalary;   // default
    }
}

/* ================= MANAGER ================= */
class Manager extends Employee {
    int teamSize;

    Manager(int id, String name, float baseSalary, int teamSize) {
        super(id, name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    float calculateSalary() {
        float allowance = baseSalary * 0.40f;
        float bonus = (teamSize > 10) ? 10000 : 0;
        return baseSalary + allowance + bonus;
    }
}

/* ================= DEVELOPER ================= */
class Developer extends Employee {
    int numberOfProjects;

    Developer(int id, String name, float baseSalary, int numberOfProjects) {
        super(id, name, baseSalary);
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    float calculateSalary() {
        float allowance = baseSalary * 0.30f;
        float extraPay = numberOfProjects * 2000;
        return baseSalary + allowance + extraPay;
    }
}

/* ================= INTERN ================= */
class Intern extends Employee {

    Intern(int id, String name, float baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    float calculateSalary() {
        return baseSalary * 0.50f;   // stipend = 50%
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {

        Employee[] emp = new Employee[10];

        // Add mixed employees
        emp[0] = new Manager(1, "Amit", 50000, 12);
        emp[1] = new Manager(2, "Rohan", 45000, 8);
        emp[2] = new Developer(3, "Priya", 55000, 4);
        emp[3] = new Developer(4, "Neha", 60000, 2);
        emp[4] = new Intern(5, "Sam", 20000);
        emp[5] = new Intern(6, "Tina", 15000);
        emp[6] = new Developer(7, "Raj", 50000, 6);
        emp[7] = new Manager(8, "Manoj", 65000, 15);
        emp[8] = new Developer(9, "Kiran", 47000, 3);
        emp[9] = new Intern(10, "Mina", 25000);

        /* ================= FIND MAX SALARY ================= */
        Employee maxEmp = emp[0];
        float maxSalary = emp[0].calculateSalary();

        int countAbove60K = 0;

        for (int i = 0; i < 10; i++) {
            float sal = emp[i].calculateSalary();

            // check max salary
            if (sal > maxSalary) {
                maxSalary = sal;
                maxEmp = emp[i];
            }

            // check salary > 60,000
            if (sal > 60000)
                countAbove60K++;
        }

        System.out.println("===== Employee with MAX Salary =====");
        System.out.println("ID : " + maxEmp.id);
        System.out.println("Name : " + maxEmp.name);
        System.out.println("Salary : " + maxSalary);

        System.out.println("\nEmployees earning above 60,000: " + countAbove60K);
    }
}
