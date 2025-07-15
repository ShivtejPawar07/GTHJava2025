/*Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene.
 */
 import java.util.*;

public class TriEqIsoSca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three sides
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // First check if it's a valid triangle
        boolean isValid = (a + b > c) && (b + c > a) && (a + c > b);

        String result = isValid 
            ? (a == b && b == c) ? "Equilateral Triangle"
            : (a == b || b == c || a == c) ? "Isosceles Triangle"
            : "Scalene Triangle"
        : "Not a valid triangle";

        System.out.println("Result: " + result);

    }
}