/*10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.

ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.

Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/
class Employee{
	String name;
	int sal;
	void setDatalis(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	void calculateBonus(){
		
	}
}
class PermanentEmployee extends Employee{
	
	void calculateBonus(){
		System.out.println("Name="+name);
		System.out.println("sal="+sal);
		System.out.println("Total Sal of man="+(sal*0.25+sal));
	}
}
class ContractEmployee extends Employee{
	void calculateBonus(){
		System.out.println("Name="+name);
		System.out.println("sal="+sal);
		System.out.println("Total Sal of dev="+(sal*0.10+sal));
	}
}
class EmployeeApp{
	public static void main(String x[]){
		PermanentEmployee m=new PermanentEmployee();
		m.setDatalis("Shivtej",1000);
		m.calculateBonus();
		ContractEmployee d=new ContractEmployee();
		d.setDatalis("Shiv",1000);
		d.calculateBonus();
	}
}