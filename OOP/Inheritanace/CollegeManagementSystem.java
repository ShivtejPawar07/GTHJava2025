import java.util.Scanner;

// ===== Parent Class =====
class Person {
    int id;
    String name;
    String address;
    String contactNo;
    static Scanner sc = new Scanner(System.in);

    Person() {
        // Default constructor
    }

    Person(int id, String name, String address, String contactNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }

    void addDetails() {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Contact No: ");
        contactNo = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact No: " + contactNo);
    }

    void updateAddress() {
        System.out.print("Enter new Address: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.println("✅ Address Updated Successfully!");
    }

    void updateContact() {
        System.out.print("Enter new Contact No: ");
        contactNo = sc.next();
        System.out.println("✅ Contact Number Updated Successfully!");
    }

    void showBasicInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact No: " + contactNo);
    }
}

// ===== Child Class 1 =====
class Student extends Person {
    String courseName;
    int[] marks = new int[3];
    double percentage;

    Student() {
        super();
    }

    Student(int id, String name, String address, String contactNo, String courseName) {
        super(id, name, address, contactNo);
        this.courseName = courseName;
    }

    void enterMarks() {
        System.out.println("\nEnter Marks for 3 Subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    void calculatePercentage() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        percentage = total / 3.0;
    }

    @Override
    void displayDetails() {
        System.out.println("\n===== Student Details =====");
        super.displayDetails();
        System.out.println("Course Name: " + courseName);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Percentage: " + percentage + "%");
    }
}

// ===== Child Class 2 =====
class Faculty extends Person {
    String subject;
    double salary;
    int experience;

    Faculty() {
        super();
    }

    Faculty(int id, String name, String address, String contactNo, double salary, int experience) {
        super(id, name, address, contactNo);
        this.salary = salary;
        this.experience = experience;
    }

    void assignSubject() {
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Subject Assigned: ");
        subject = sc.nextLine();
    }

    void calculateIncrement() {
        if (experience > 5) {
            salary = salary + (salary * 0.10);
            System.out.println("✅ Salary incremented by 10% due to experience > 5 years.");
        } else {
            System.out.println("No increment (experience ≤ 5 years).");
        }
    }

    @Override
    void displayDetails() {
        System.out.println("\n===== Faculty Details =====");
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
    }

    void displayFacultyInfo() {
        displayDetails();
    }
}

// ===== Main Class =====
public class CollegeManagementSystem {
    public static void main(String[] args) {
		
        System.out.println("===== COLLEGE MANAGEMENT SYSTEM =====");

        // 1. Add student details
        Student s = new Student();
        System.out.println("\n1️⃣ Add Student Details:");
        s.addDetails();
        System.out.print("Enter Course Name: ");
        s.courseName = Person.sc.next();

        // 2. Enter marks
        System.out.println("\n2️⃣ Enter Marks:");
        s.enterMarks();

        // 3. Calculate percentage
        System.out.println("\n3️⃣ Calculate Percentage:");
        s.calculatePercentage();

        // 4. Update contact number
        System.out.println("\n4️⃣ Update Student Contact:");
        s.updateContact();

        // 5. Display student details
        System.out.println("\n5️⃣ Display Student Details:");
        s.displayDetails();

        // 6. Add faculty details
        Faculty f = new Faculty();
        System.out.println("\n6️⃣ Add Faculty Details:");
        f.addDetails();
        System.out.print("Enter Salary: ");
        f.salary = Person.sc.nextDouble();
        System.out.print("Enter Experience (in years): ");
        f.experience = Person.sc.nextInt();

        // 7. Assign subject
        System.out.println("\n7️⃣ Assign Subject:");
        f.assignSubject();

        // 8. Calculate salary increment
        System.out.println("\n8️⃣ Calculate Salary Increment:");
        f.calculateIncrement();

        // 9. Update address
        System.out.println("\n9️⃣ Update Faculty Address:");
        f.updateAddress();

        // 10. Display complete faculty info
        System.out.println("\nDisplay Faculty Information:");
        f.displayFacultyInfo();

        System.out.println("\nAll 10 operations completed successfully!");
    }
}
