/***9. Restaurant Ordering System**

**Description:**

* Show menu items and let user order.
* If they choose "skip", **continue** to next iteration without adding to order.
* If "done" is entered, **break** and print final bill.
* Implement using a do-while loop.

*/
import java.util.*;
class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java Café!");
        System.out.println("Menu:");
        System.out.println("1. Pizza - ₹200");
        System.out.println("2. Burger - ₹100");
        System.out.println("3. Coffee - ₹50");
        System.out.println("Type 'skip' to skip order, 'done' to finish.");

        int bill = 0;
        String choice;

        do {
            System.out.print("Enter your choice: ");
            choice = sc.next();

            if (choice.equalsIgnoreCase("skip")) {
                System.out.println("Skipping this round...");
                continue;
            }

            if (choice.equalsIgnoreCase("done")) {
                break;
            }

            switch (choice) {
                case "1":
                    bill += 200;
                    System.out.println("Pizza added.");
                    break;
                case "2":
                    bill += 100;
                    System.out.println("Burger added.");
                    break;
                case "3":
                    bill += 50;
                    System.out.println("Coffee added.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (true);

        System.out.println("Final bill: ₹" + bill);
        System.out.println("Thank you for visiting!");

    }
}
