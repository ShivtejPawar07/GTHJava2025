package com.tot;

public class StudentOper {
    Student[] s;

    public void accept(Student... s) {
        this.s = s;
    }

    // ✅ Show total and average of each student
    public void showTotal() {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Roll No = " + s[i].getRn());
            System.out.println("Name = " + s[i].getName());

            int[] marks = s[i].getMarks();
            int sum = 0;
            for (int j = 0; j < marks.length; j++) {
                sum += marks[j];
            }

            float avg = (float) sum / marks.length;
            System.out.println("Total Marks = " + sum);
            System.out.println("Average = " + avg);
            System.out.println("---------------------------------");
        }
    }

    // ✅ Find student with highest average marks
    public void maxAvg() {
        Student topStudent = null;
        float maxAvg = 0;

        for (int i = 0; i < s.length; i++) {
            int[] marks = s[i].getMarks();
            int sum = 0;
            for (int j = 0; j < marks.length; j++) {
                sum += marks[j];
            }
            float avg = (float) sum / marks.length;

            if (avg > maxAvg) {
                maxAvg = avg;
                topStudent = s[i];
            }
        }

        if (topStudent != null) {
            System.out.println("🏆 Student with Highest Average Marks:");
            System.out.println("Roll No = " + topStudent.getRn());
            System.out.println("Name = " + topStudent.getName());
            System.out.println("Highest Average = " + maxAvg);
            System.out.println("---------------------------------");
        }
    }

    //Show students who failed in any subject
    public void showFailedStudents() {
        System.out.println("Students who failed in at least one subject:");
        boolean found = false;

        for (int i = 0; i < s.length; i++) {
            int[] marks = s[i].getMarks();
            boolean failed = false;

            for (int j = 0; j < marks.length; j++) {
                if (marks[j] < 35) {
                    failed = true;
                    break;
                }
            }

            if (failed) {
                found = true;
                System.out.println("Roll No = " + s[i].getRn() + ", Name = " + s[i].getName());
            }
        }

        if (!found) {
            System.out.println("No student has failed in any subject!");
        }
        System.out.println("---------------------------------");
    }
}
