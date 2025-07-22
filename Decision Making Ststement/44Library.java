/*Q44. Calculate fine for library book return:

Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.*/
import java.util.*;

class Library {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of days late: ");
        int n = sc.nextInt();
        int fine = 0;

        if (n >= 1 && n <= 5) {
            fine = n * 2;
            System.out.println("Fine:" + fine);
            System.out.println("Membership Status: Active");
        } else if (n >= 6 && n <= 10) {
            fine = n * 3;
            System.out.println("Fine:" + fine);
            System.out.println("Membership Status: Active");
        } else if (n >= 11 && n <= 30) {
            fine = n * 5;
            System.out.println("Fine:" + fine);
            System.out.println("Membership Status: Active");
        } else if (n > 30) {
            fine = 500;
            System.out.println("Fine:" + fine);
            System.out.println("Membership Status: Cancelled");
        } else {
            System.out.println("No fine. Book returned on time!");
        }
    }
}
