package com.tot;

import java.util.Scanner;

public class College {
    Scanner sc = new Scanner(System.in);
    Student[] s; // array of students

    // Accept array size
    public void accept(Student...s) {
        this.s=s;
    }

    // 1. Add Student
    public void addStudent() {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter Student Id, Name, Email, Contact, Course, Marks:");
            int id = sc.nextInt();
            String name = sc.next();
            String email = sc.next();
            String contact = sc.next();
            String course = sc.next();
            int marks = sc.nextInt();

            s[i] = new Student(id, name, email, contact, course, marks);
            System.out.println("Student added successfully!");
        }
    }

    // 2. Display All Students
    public void displayStud() {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println("-------------------------------------------------");
                System.out.println("Id=" + s[i].getId());
                System.out.println("Name=" + s[i].getName());
                System.out.println("Email=" + s[i].getEmail());
                System.out.println("Contact=" + s[i].getContact());
                System.out.println("Course=" + s[i].getCourse());
                System.out.println("Marks=" + s[i].getMarks());
            }
        }
        System.out.println("-------------------------------------------------");
    }

    // 3. Search Student
    public void searchStudent() {
        System.out.println("Search Student");
        System.out.println("1. By Id");
        System.out.println("2. By Name");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        boolean found = false;

        switch (choice) {
            case 1:
                System.out.print("Enter Id: ");
                int id = sc.nextInt();
                for (int i = 0; i < s.length; i++) {
                    if (s[i] != null && s[i].getId() == id) {
                        System.out.println("Student Found: " + s[i].getName() + ", Marks: " + s[i].getMarks());
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("No student found with Id " + id);
                break;

            case 2:
                System.out.print("Enter Name: ");
                String name = sc.next();
                for (int i = 0; i < s.length; i++) {
                    if (s[i] != null && s[i].getName().equalsIgnoreCase(name)) {
                        System.out.println("Student Found: Id=" + s[i].getId() + ", Marks=" + s[i].getMarks());
                        found = true;
                    }
                }
                if (!found) System.out.println("No student found with Name " + name);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    // 4. Delete Student
    public void deleteStudent() {
        System.out.println("Delete Student");
        System.out.println("1. By Email");
        System.out.println("2. Failed (Marks < 40)");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        boolean found = false;

        switch (choice) {
            case 1:
                System.out.print("Enter Email: ");
                String email = sc.next();
                for (int i = 0; i < s.length; i++) {
                    if (s[i] != null && s[i].getEmail().equalsIgnoreCase(email)) {
                        s[i] = null; // delete by setting null
                        System.out.println("Student deleted successfully by email.");
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("No student found with email " + email);
                break;

            case 2:
                for (int i = 0; i < s.length; i++) {
                    if (s[i] != null && s[i].getMarks() < 40) {
                        s[i] = null; // delete failed students
                        found = true;
                    }
                }
                if (found) System.out.println("All failed students deleted successfully.");
                else System.out.println("No failed students found.");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    // 5. Update Student
    public void updateStudentByIdOrName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update Student");
        System.out.println("1. Update Student By Id");
        System.out.println("2. Update Student By Name");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Id of student to update: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                boolean foundById = false;

                for (int i = 0; i < s.length; i++) {
                    if (s[i] != null && s[i].getId() == id) {
                        System.out.print("Enter new Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter new Email: ");
                        String email = sc.nextLine();

                        System.out.print("Enter new Contact: ");
                        String contact = sc.nextLine();

                        System.out.print("Enter new Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter new Marks: ");
                        int marks = sc.nextInt();

                        s[i] = new Student(id, name, email, contact, course, marks);
                        System.out.println("Student details updated successfully!");
                        foundById = true;
                        break;
                    }
                }
                if (!foundById) System.out.println("No student found with Id " + id);
                break;

            case 2:
                System.out.print("Enter Name of student to update: ");
                String oldName = sc.nextLine();
                boolean foundByName = false;

                for (int i = 0; i < s.length; i++) {
                    if (s[i] != null && s[i].getName().equalsIgnoreCase(oldName)) {
                        System.out.print("Enter new Id: ");
                        int newId = sc.nextInt();
                        sc.nextLine(); // consume newline

                        System.out.print("Enter new Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter new Email: ");
                        String email = sc.nextLine();

                        System.out.print("Enter new Contact: ");
                        String contact = sc.nextLine();

                        System.out.print("Enter new Course: ");
                        String course = sc.nextLine();

                        System.out.print("Enter new Marks: ");
                        int marks = sc.nextInt();

                        s[i] = new Student(newId, name, email, contact, course, marks);
                        System.out.println("Student details updated successfully!");
                        foundByName = true;
                        break;
                    }
                }
                if (!foundByName) System.out.println("No student found with Name " + oldName);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

 // 6. Sort Students
    public void sortStudents() {
        System.out.println("Sort Students:");
        System.out.println("1. By Id Ascending");
        System.out.println("2. By Marks Descending");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // By Id ascending
                for (int i = 0; i < s.length - 1; i++) {
                    for (int j = i + 1; j < s.length; j++) {
                        if (s[i] != null && s[j] != null && s[i].getId() > s[j].getId()) {
                            Student temp = s[i];
                            s[i] = s[j];
                            s[j] = temp;
                        }
                    }
                }
                System.out.println("Students sorted by Id ascending.");
                break;

            case 2: // By Marks descending
                for (int i = 0; i < s.length - 1; i++) {
                    for (int j = i + 1; j < s.length; j++) {
                        if (s[i] != null && s[j] != null && s[i].getMarks() < s[j].getMarks()) {
                            Student temp = s[i];
                            s[i] = s[j];
                            s[j] = temp;
                        }
                    }
                }
                System.out.println("Students sorted by Marks descending.");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
 // 7. Display Topper
    public void displayTopper() {
        if (s.length == 0) {
            System.out.println("No students available.");
            return;
        }
        Student topper = null;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                if (topper == null || s[i].getMarks() > topper.getMarks()) {
                    topper = s[i];
                }
            }
        }
        if (topper != null) {
            System.out.println("Topper Student:");
            System.out.println("Id=" + topper.getId());
            System.out.println("Name=" + topper.getName());
            System.out.println("Marks=" + topper.getMarks());
        } else {
            System.out.println("No students available.");
        }
    }
 // 8. Display Students in Marks Range 50-80
    public void displayStudentsInRange() {
        boolean found = false;
        System.out.println("Students with marks between 50 and 80:");
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null && s[i].getMarks() >= 50 && s[i].getMarks() <= 80) {
                System.out.println("Id=" + s[i].getId() + ", Name=" + s[i].getName() + ", Marks=" + s[i].getMarks());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found in this marks range.");
        }
    }

}
