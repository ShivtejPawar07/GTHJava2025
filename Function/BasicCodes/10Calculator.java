/*10
Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
*/
import java.util.*;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("\nChoose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + add(a, b));
                break;
            case 2:
                System.out.println("Result = " + subtract(a, b));
                break;
            case 3:
                System.out.println("Result = " + multiply(a, b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result = " + divide(a, b));
                } else {
                    System.out.println("Error: Division by zero not allowed!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Function definitions
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;  // integer division
    }
}
