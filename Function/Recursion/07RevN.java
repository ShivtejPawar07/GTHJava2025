/*07Write a program to print numbers from n down to 1 using recursion.
*/
import java.util.*;
class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        printNum(n);  // start from n
    }
    // Recursive function
    public static void printNum(int n) {
        if (n==0) {
            return;  // base case
        }
        System.out.print(n + " ");
        printNum(n - 1); // recursive call
    }
}
