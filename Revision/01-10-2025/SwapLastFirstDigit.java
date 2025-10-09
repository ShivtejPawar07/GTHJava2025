/*swaps the first and last digits of a number using only math operations.*/
import java.util.*;
class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;

        // Find number of digits
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        if (digits < 2) {
            System.out.println("Number must have at least 2 digits.");
            return;
        }

        int first = num / (int)Math.pow(10, digits - 1); // first digit
        int last = num % 10;                             // last digit

        // Remove first and last digits from original number
        int middle = (num % (int)Math.pow(10, digits - 1)) / 10;

        // New number = last + middle + first
        int result = last * (int)Math.pow(10, digits - 1) + middle * 10 + first;

        System.out.println("After swapping: " + result);
    }
}
