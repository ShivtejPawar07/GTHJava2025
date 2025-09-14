import java.util.*;

class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        printNum(1, n);  // start from 1
    }
    // Recursive function
    public static void printNum(int i, int n) {
        if (i > n) {
            return;  // base case
        }
        System.out.print(i + " ");
        printNum(i + 1, n); // recursive call
    }
}
