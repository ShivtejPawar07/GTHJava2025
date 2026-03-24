/*Q7. Problem Statement: Create an abstract class Student with attributes roll number, name, and 
an array of marks (5 subjects). 
Create an interface ResultOperations with methods calculateTotal(), calculatePercentage(), and 
assignGrade(). 
 
• Implement UGStudent and PGStudent classes with grading rules: 
UG: Pass if percentage ≥ 40% 
PG: Pass if percentage ≥ 50% 
Additional Requirements: 
1. Store details for N students in an array. 
2. Display: - List of passed and failed students separately. - Top 3 students by percentage. - Average marks in each subject. 
 
Explanation: Covers abstraction for common structure, interface for calculations, array processing 
for N students, sorting for top students, and subject-wise aggregation.*/

abstract class Student{
	int rno;
	String name;
	int[]marks;
	int total;
	double percentage;
	Student(int rno,String name,int[]marks){
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
}
interface ResultOperations {
    void calculateTotal();
    void calculatePercentage();
    void assignGrade();
}

class UGStudent extends Student implements ResultOperations {

    UGStudent(int rno, String name, int[] marks) {
        super(rno, name, marks);
    }

    public void calculateTotal() {
        total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
    }

    public void calculatePercentage() {
        percentage = (total / 500.0) * 100;
    }

    public void assignGrade() {
        if (percentage >= 40)
            System.out.println(name + " (UG) : PASS");
        else
            System.out.println(name + " (UG) : FAIL");
    }
}

class PGStudent extends Student implements ResultOperations {

    PGStudent(int rno, String name, int[] marks) {
        super(rno, name, marks);
    }

    public void calculateTotal() {
        total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
    }

    public void calculatePercentage() {
        percentage = (total / 500.0) * 100;
    }

    public void assignGrade() {
        if (percentage >= 50)
            System.out.println(name + " (PG) : PASS");
        else
            System.out.println(name + " (PG) : FAIL");
    }
}

class StudentApp {
    public static void main(String[] args) {

        int[] m1 = {60, 70, 80, 90, 50};
        int[] m2 = {40, 45, 50, 35, 30};

        ResultOperations s1 = new UGStudent(1, "Shivtej", m1);
        ResultOperations s2 = new PGStudent(2, "Shiv", m2);

        s1.calculateTotal();
        s1.calculatePercentage();
        s1.assignGrade();

        s2.calculateTotal();
        s2.calculatePercentage();
        s2.assignGrade();
    }
}

