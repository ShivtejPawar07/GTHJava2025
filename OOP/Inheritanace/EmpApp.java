/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.
Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/
class Employee{
	String name;
	int sal;
	void setDatalis(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	void getBonus(){
		
	}
}
class Manager extends Employee{
	
	void getBonus(){
		System.out.println("Name="+name);
		System.out.println("sal="+sal);
		System.out.println("Total Sal of man="+(sal*0.20+sal));
	}
}
class Developer extends Employee{
	void getBonus(){
		System.out.println("Name="+name);
		System.out.println("sal="+sal);
		System.out.println("Total Sal of dev="+(sal*0.10+sal));
	}
}
class EmpApp{
	public static void main(String x[]){
		Manager m=new Manager();
		m.setDatalis("Shivtej",1000);
		m.getBonus();
		Developer d=new Developer();
		d.setDatalis("Shiv",1000);
		d.getBonus();
	}
}
