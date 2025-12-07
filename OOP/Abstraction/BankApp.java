/*Q5. Create a banking system to compute interest and transaction charges.
Requirements
Create interface Transactable:
deposit()
withdraw()
Create abstract class BankAccount:
accNo, name, balance
abstract double calculateInterest()
Create 3 child classes:
SavingsAccount
CurrentAccount
FixedDepositAccount
Logic:
Savings → 6% interest
Current → no interest, but 500 monthly maintenance fee
FD → interest based on duration:
< 1 year → 6%
1-3 years → 7.5%
3 years → 8.25%

Withdraw logic:
Savings → allow only if balance ≥ 1000
Current → allow overdraft up to −5000
FD → withdrawal not allowed before maturity
Show:
Interest
Final balance after deposit/withdraw
Account summary
Explanation
This question uses:
Complex conditional logic
Different behavior in each subclass
Polymorphism + abstraction + interface combination
Real banking rules
*/
import java.util.*;

interface Transactable {
    void deposit(double amount);
    void withdraw(double amount);
}

abstract class BankAccount implements Transactable {
    int accNo;
    String name;
    double balance;

    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void showSummary() {
        System.out.println("\n---- Account Summary ----");
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println("--------------------------\n");
    }
}

/* ---------------------- SAVINGS ACCOUNT ---------------------- */

class SavingsAccount extends BankAccount {

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
        } else {
            System.out.println("❌ Savings: Minimum balance ₹1000 required!");
        }
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

/* ---------------------- CURRENT ACCOUNT ---------------------- */

class CurrentAccount extends BankAccount {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
        } else {
            System.out.println("❌ Current: Overdraft limit -5000 exceeded!");
        }
    }

    @Override
    double calculateInterest() {
        return -500; // monthly maintenance charge
    }
}

/* ---------------------- FIXED DEPOSIT ACCOUNT ---------------------- */

class FixedDepositAccount extends BankAccount {
    int duration; // in years

    FixedDepositAccount(int accNo, String name, double balance, int duration) {
        super(accNo, name, balance);
        this.duration = duration;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("❌ FD: Withdrawal not allowed before maturity!");
    }

    @Override
    double calculateInterest() {
        if (duration < 1)
            return balance * 0.06;
        else if (duration <= 3)
            return balance * 0.075;
        else
            return balance * 0.0825;
    }
}

/* ---------------------- MAIN CLASS ---------------------- */

public class BankApp {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, "Shivtej", 5000);
        s.deposit(1000);
        s.withdraw(2000);
        s.showSummary();

        CurrentAccount c = new CurrentAccount(102, "Tejas", 2000);
        c.withdraw(6500);
        c.deposit(5000);
        c.showSummary();

        FixedDepositAccount f = new FixedDepositAccount(103, "Pawar", 10000, 4);
        f.deposit(2000);
        f.withdraw(5000); // Not allowed
        f.showSummary();
    }
}
