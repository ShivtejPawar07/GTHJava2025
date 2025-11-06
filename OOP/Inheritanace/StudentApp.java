/* 
Q4. Create a class Student with fields name and marks. 
Create subclasses EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
Display results for both types of students using an overridden method.
*/

class Student {
    String name;
    int marks;

    void setDetails(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayResult() {
        // To be overridden by subclasses
    }
}

class EngineeringStudent extends Student {
    @Override
    void displayResult() {
        System.out.println("---- Engineering Student ----");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        if (marks >= 50)
            System.out.println("Result: Pass ✅");
        else
            System.out.println("Result: Fail ❌");
        System.out.println();
    }
}

class MedicalStudent extends Student {
    @Override
    void displayResult() {
        System.out.println("---- Medical Student ----");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        if (marks >= 50)
            System.out.println("Result: Pass ✅");
        else
            System.out.println("Result: Fail ❌");
        System.out.println();
    }
}

public class StudentApp {
    public static void main(String[] args) {
        EngineeringStudent e1 = new EngineeringStudent();
        e1.setDetails("Shivtej Pawar", 72);
        e1.displayResult();

        MedicalStudent m1 = new MedicalStudent();
        m1.setDetails("Shiv Pawar", 45);
        m1.displayResult();
    }
}
