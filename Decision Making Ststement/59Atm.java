import java.util.*;

class Atm {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int ch;

        do {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    int dep = sc.nextInt();
                    if (dep > 0) {
                        balance += dep;
                        System.out.println("Deposited successfully.");
                        System.out.println("Bank balance after deposit:" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    int wd = sc.nextInt();
                    if (wd > 0 && balance >= wd) {
                        balance -= wd;
                        System.out.println("Withdrawn successfully.");
                        System.out.println("Bank balance after withdrawal:" + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current Bank Balance:" + balance);
                    break;

                case 4:
                    System.out.println("Thank you! Visit again.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (ch != 4);
    }
}
