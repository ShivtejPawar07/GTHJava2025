/*11Write a program to reverse a given number using recursion.
*/
import java.util.*;
class ReverseRec {
    // Recursive function to reverse a number
    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);//121/10,
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");//121
        int n = sc.nextInt();

        int rev = reverse(n, 0);//121,0
		
            System.out.println("Reverse="+rev);
    }
}