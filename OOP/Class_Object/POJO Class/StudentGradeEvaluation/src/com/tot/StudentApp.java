package com.tot;

public class StudentApp {
	public static void main(String[] args) {
        // Create a student object
        Student s1 = new Student("Shivtej", 35, "Java");
        StudPass sa=new StudPass();
        sa.accept(s1);
        sa.show();
	}
}
