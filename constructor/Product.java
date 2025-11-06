/* 4Create a class Product with fields id, name, and price.
 Implement:
A parameterized constructor to initialize product details.
A copy constructor to copy data from another object.
 Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/

class Product {
    int id;
    String name;
    int price;

    // Parameterized constructor
    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Copy constructor
    Product(Product p) {
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
    }

    // Method to display product details
    void display() {
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Price        : " + price);
        System.out.println("----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Original product
        Product p1 = new Product(101, "Laptop", 50000);
        System.out.println("Original Product:");
        p1.display();

        // Copy of product using copy constructor
        Product p2 = new Product(p1);
        System.out.println("Copied Product:");
        p2.display();
    }
}
