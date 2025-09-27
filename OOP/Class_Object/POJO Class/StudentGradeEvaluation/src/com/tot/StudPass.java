package com.tot;

public class StudPass {
	Student[] std;
	public void accept(Student... std) {
		this.std=std;
	}
	public void show() {
	
	System.out.println("Name: " + std[0].getName());
	 System.out.println("Marks: " + std[0].getMarks());
    System.out.println("Subject: " + std[0].getSubject());

    if (std[0].getMarks() >= 40) {
        System.out.println("Result: Passed");
    } else {
        System.out.println("Result: Failed");
    }
	}
}
