/*Q1. Online Payment System – Using Interface
Interface: Payment
Methods:
processPayment(double amount)
getCharges()
Classes Implementing Interface:
UPI – No extra charges
CreditCard – 2% processing fee
DebitCard – 1% processing fee
Task:
Take 5 payments (mix of UPI, credit, debit).
Print final amount after adding charges.
Count how many payments used CreditCard.
Explanation:
This question checks:
How class implements an interface
Polymorphism using interface reference
Logic to add percentage charges
Filtering and counting items
*/
interface Payment {
    double processPayment(double amount);  // returns final amount
    double getCharges();                  // return charges percentage
}

// --------------------------------------------------------

class UPI implements Payment {
    public double getCharges() {
        return 0; // no extra charges
    }

    public double processPayment(double amount) {
        return amount + (amount * getCharges());
    }
}

// --------------------------------------------------------

class CreditCard implements Payment {
    public double getCharges() {
        return 0.02; // 2% charges
    }

    public double processPayment(double amount) {
        return amount + (amount * getCharges());
    }
}

// --------------------------------------------------------

class DebitCard implements Payment {
    public double getCharges() {
        return 0.01; // 1% charges
    }

    public double processPayment(double amount) {
        return amount + (amount * getCharges());
    }
}

// --------------------------------------------------------

public class OnlinePaymentSystem {
    public static void main(String[] args) {

        Payment[] payments = new Payment[5];

        payments[0] = new UPI();
        payments[1] = new CreditCard();
        payments[2] = new DebitCard();
        payments[3] = new CreditCard();
        payments[4] = new UPI();

        double[] amounts = {500, 1000, 750, 2000, 1500};

        int creditCardCount = 0;

        System.out.println("=== Final Amounts After Charges ===");

        for (int i = 0; i < 5; i++) {

            double finalAmount = payments[i].processPayment(amounts[i]);
            System.out.println("Payment " + (i + 1) +
                               " → Final Amount: " + finalAmount);

            if (payments[i] instanceof CreditCard)
                creditCardCount++;
        }

        System.out.println("\nTotal payments done using CreditCard = " + creditCardCount);
    }
}

