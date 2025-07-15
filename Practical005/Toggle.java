/* Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.

·        Example: a → A, Z → z.*/
import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet character: ");
        char ch = sc.next().charAt(0);

        // Toggle case using ASCII values
        char toggled = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) :
                       (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) :
                       ch;  // If not a letter, leave it as-is

        System.out.println("Toggled character: " + toggled);
    }
}
