import java.util.*;

// Interface
interface CourseContent {
    int getDuration();
    String getCategory();
}

// Abstract Class
abstract class Course implements CourseContent {
    String title;
    double price;

    Course(String title, double price) {
        this.title = title;
        this.price = price;
    }

    abstract double finalPrice(); // GST + extra charges
}

// Programming Course
class ProgrammingCourse extends Course {

    int duration;

    ProgrammingCourse(String title, double price, int duration) {
        super(title, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getCategory() {
        return "Programming";
    }

    double finalPrice() {
        return price + (price * 0.18); // 18% GST
    }
}

// Design Course
class DesignCourse extends Course {

    int duration;

    DesignCourse(String title, double price, int duration) {
        super(title, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getCategory() {
        return "Design";
    }

    double finalPrice() {
        return price + (price * 0.12); // 12% GST
    }
}

// Marketing Course
class MarketingCourse extends Course {

    int duration;

    MarketingCourse(String title, double price, int duration) {
        super(title, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getCategory() {
        return "Marketing";
    }

    double finalPrice() {
        double gstPrice = price + (price * 0.10); // 10% GST
        if (duration > 20) {
            gstPrice += 150; // extra charge
        }
        return gstPrice;
    }
}

// Main Class
class CourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Course Type (1-Programming, 2-Design, 3-Marketing): ");
        int type = sc.nextInt();

        System.out.print("Enter Title: ");
        String title = sc.next();

        System.out.print("Enter Duration (hrs): ");
        int duration = sc.nextInt();

        System.out.print("Enter Base Price: ");
        double price = sc.nextDouble();

        Course c = null;

        switch (type) {
            case 1:
                c = new ProgrammingCourse(title, price, duration);
                break;
            case 2:
                c = new DesignCourse(title, price, duration);
                break;
            case 3:
                c = new MarketingCourse(title, price, duration);
                break;
            default:
                System.out.println("Invalid type!");
                System.exit(0);
        }

        // Output
        System.out.println("\n----- Course Details -----");
        System.out.println("Title: " + c.title);
        System.out.println("Category: " + c.getCategory());
        System.out.println("Duration: " + c.getDuration() + " hrs");
        System.out.println("Base Price: ₹" + c.price);
        System.out.println("Final Price (with GST): ₹" + c.finalPrice());
    }
}
