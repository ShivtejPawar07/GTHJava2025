/* 
Q2. Create a class BankAccount with a method calculateInterest().
Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
Calculate interest for different account types and display it.
*/

class BankAccount {
    String accHolderName;
    double balance;

    void setDetails(String accHolderName, double balance) {
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    void calculateInterest() {
        // To be overridden by subclasses
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("---- Savings Account ----");
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest (5%): " + interest);
        System.out.println("Total Amount: " + (balance + interest));
        System.out.println();
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void calculateInterest() {
        double interest = balance * 0.03;
        System.out.println("---- Current Account ----");
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest (3%): " + interest);
        System.out.println("Total Amount: " + (balance + interest));
        System.out.println();
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setDetails("Shivtej Dipak Pawar", 10000);
        sa.calculateInterest();

        CurrentAccount ca = new CurrentAccount();
        ca.setDetails("Shiv Pawar", 20000);
        ca.calculateInterest();
    }
}
