import java.util.*;

class Person {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    String add;
    String cno;

    Person() {
    }

    Person(int id, String name, String add, String cno) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.cno = cno;
    }

    void addDetails() {
        System.out.println("Enter id, name, address, contact number:");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        name = sc.nextLine();
        add = sc.nextLine();
        cno = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Address = " + add);
        System.out.println("Contact No = " + cno);
    }

    void updateAddress() {
        System.out.println("Enter a New Address:");
        add = sc.next();
        System.out.println("New Address = " + add);
    }

    void updateContact() {
        System.out.println("Enter a New Contact:");
        cno = sc.next();
        System.out.println("New Contact = " + cno);
    }

    void showBasicInfo() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Address = " + add);
        System.out.println("Contact No = " + cno);
    }
}

class Student extends Person {
    String cname;
    int[] marks = new int[3];
    double per;

    Student() {
    }

    Student(int id, String name, String add, String cno, String cname) {
        super(id, name, add, cno);
        this.cname = cname;
    }

    void enterMarks() {
        System.out.println("Enter marks of three subjects:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
    }

    void calculatePercentage() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }
        per = sum / 3.0; // use double division
        System.out.println("Percentage = " + per);
    }

    @Override
    void displayDetails() {
        super.displayDetails(); // show basic details too
        System.out.println("College Name = " + cname);
        System.out.println("Marks = " + marks[0] + " " + marks[1] + " " + marks[2]);
        System.out.println("Percentage = " + per);
    }
}

class Faculty extends Person {
    String sub;
    double sal;
    int exp;

    Faculty() {
    }

    Faculty(int id, String name, String add, String cno, String sub, double sal, int exp) {
        super(id, name, add, cno);
        this.sub = sub;
        this.sal = sal;
        this.exp = exp;
    }

    void assignSubject() {
        System.out.println("Enter subject:");
        sub = sc.next();
    }

    void calculateIncrement() {
        double inc = 0;
        if (exp >= 10)
            inc = sal * 0.20;
        else if (exp >= 5)
            inc = sal * 0.10;
        else
            inc = sal * 0.05;

        sal += inc;
        System.out.println("Updated Salary after increment = " + sal);
    }

    void displayFacultyInfo() {
        super.displayDetails();
        System.out.println("Subject = " + sub);
        System.out.println("Salary = " + sal);
        System.out.println("Experience = " + exp + " years");
    }
}

public class CollegeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("1. Add Student Details");
        s.addDetails();

        System.out.println("2. Enter College Name:");
        s.cname = sc.next();

        System.out.println("3. Enter Marks for Three Subjects");
        s.enterMarks();

        System.out.println("4. Calculate and Store the Student’s Percentage");
        s.calculatePercentage();

        System.out.println("5. Update the Student’s Contact Number");
        s.updateContact();

        System.out.println("6. Display All Details of the Student");
        s.displayDetails();
    }
}
