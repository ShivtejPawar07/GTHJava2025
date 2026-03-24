/*Q1. Problem:
 Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
*/

class Employee{
	int id;
	String name;
	double bs;
	double hra;
	double da;
	double gs;
	
	Employee(int id,String name,double bs){
		this.id=id;
		this.name=name;
		this.bs=bs;
		da=10;
		hra=10;
	}
	void display(){
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("BasicSal="+bs);
		System.out.println("HRA = 10% of basic="+(bs*0.10));
		System.out.println("DA = 10% of basic="+(da*0.10));
		System.out.println("GrossSal="+gs);
	}
	public static void main(String x[]){
		Employee e=new Employee(1,"Shivtej",1000);
		e.display();
	}
}