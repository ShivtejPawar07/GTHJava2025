/*Q28. Write a java program to find all roots of a quadratic equation using if else. 
How to find all roots of a quadratic equation using if else in java programming.

Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30*/

import java.util.*;

class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;  // Discriminant

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Root1:%f\n", root1);
            System.out.printf("Root2: %f\n", root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root1 = Root2 = %f\n", root);
        } else {
            System.out.println("Roots are imaginary (complex roots)");
        }
    }
}
