/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.*/
 
class Student{
	int rno;
	String name;
	int m1;
	int m2;
	int m3;
	int total;
	int r;
	String n;
	Student(int rno,String name,int m1,int m2,int m3){
		r=rno;
		n=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		
		total=m1+m2+m3;
	}
	void display(){
		System.out.println("Roll No="+r);
		System.out.println("Name="+n);
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		System.out.println("m2="+m3);
		System.out.println("Total="+total);
	}
	public static void main(String x[]){
		Student s=new Student(1,"Shivtej",10,20,30);
		s.display();
	}
}                                 

