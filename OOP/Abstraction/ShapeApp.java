/*Q5. Create an abstract class Shape with two sides as fields and an abstract method area() and perimeter().
Use a constructor to initialize side values.
Create subclasses Rectangle and Triangle:
For Rectangle, compute area = l*b and perimeter = 2(l+b)
For Triangle, assume equilateral triangle and calculate using:
Area = (√3 / 4) × side²
Perimeter = 3 × side
*/

abstract class Shape {
    float l;
    float b;
    float s;

    Shape(float l, float b, float s) {
        this.l = l;
        this.b = b;
        this.s = s;
    }

    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape {
    Rectangle(float l, float b) {
        super(l, b, 0); // s not needed for rectangle
    }

    void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (l + b)));
    }
}

class Triangle extends Shape {
    Triangle(float s) {
        super(0, 0, s); // only side needed for equilateral triangle
    }

    void area() {
        System.out.println("Area of Triangle = " + ((Math.sqrt(3) / 4) * s * s));
    }

    void perimeter() {
        System.out.println("Perimeter of Triangle = " + (3 * s));
    }
}

class ShapeApp {
    public static void main(String[] args) {
        
        Shape r = new Rectangle(10, 5);
        r.area();
        r.perimeter();

        Shape t = new Triangle(6);
        t.area();
        t.perimeter();
    }
}
