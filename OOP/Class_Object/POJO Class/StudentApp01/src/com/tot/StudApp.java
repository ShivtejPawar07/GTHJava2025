package com.tot;

public class StudApp {
	public static void main(String x[]) {
		
		Student s1 = new Student(1, "Shivtej", new int[]{80, 90, 70});
        Student s2 = new Student(2, "Tej", new int[]{60, 30, 40});
        Student s3 = new Student(3, "Rahul", new int[]{50, 50, 50});

		StudentOper so=new StudentOper();
		so.accept(s1,s2,s3);
		so.showTotal();
		so.maxAvg();
		so.showFailedStudents();
		}
}
