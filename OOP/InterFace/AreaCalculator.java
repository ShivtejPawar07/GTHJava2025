/*Q4. Area Calculator – Geometric Shapes
Interface: Shape
Method:
double area()
Implementing Classes:
Circle → π × r²
Rectangle → l × b
Triangle → ½ × base × height
Task:
Create 9 shapes (3 of each type).
Print area of each.
 shape with maximum area.
Explanation:
Strengthens:
Interface polymorphism
Math logic per shape
Maximum value logic using loops
Usage of interface array
*/
import java.util.Scanner;

interface Shape {
    double area();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
}

class Rectangle implements Shape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double area() {
        return l * w;
    }
}

class Triangle implements Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return 0.5 * b * h;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[9];

        for (int i = 0; i < 9; i++) {
            System.out.println("Enter shape type (Circle/Rectangle/Triangle):");
            String type = sc.next();

            switch (type.toLowerCase()) {
                case "circle":
                    System.out.println("Enter radius:");
                    double r = sc.nextDouble();
                    shapes[i] = new Circle(r);
                    break;
                case "rectangle":
                    System.out.println("Enter length:");
                    double l = sc.nextDouble();
                    System.out.println("Enter width:");
                    double w = sc.nextDouble();
                    shapes[i] = new Rectangle(l, w);
                    break;
                case "triangle":
                    System.out.println("Enter base:");
                    double b = sc.nextDouble();
                    System.out.println("Enter height:");
                    double h = sc.nextDouble();
                    shapes[i] = new Triangle(b, h);
                    break;
                default:
                    System.out.println("Invalid type, defaulting to Circle with radius 1");
                    shapes[i] = new Circle(1);
            }
        }

        // Print area of each shape
        System.out.println("\nAreas of all shapes:");
        double maxArea = 0;
        Shape maxShape = null;
        for (int i = 0; i < 9; i++) {
            double a = shapes[i].area();
            System.out.printf("Shape %d area: %.2f%n", i + 1, a);
            if (a > maxArea) {
                maxArea = a;
                maxShape = shapes[i];
            }
        }

        System.out.printf("Maximum area is: %.2f%n", maxArea);
        sc.close();
    }
}
