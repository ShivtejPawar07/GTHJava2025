/*Q5. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object
*/
class Employee{
	private int id;
	private String name;
	private int sal;
	Employee(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getSal(){
		return sal;
	}
}
class EmployeeApp{
	public static void main(String x[]){
		Employee e1=new Employee(1,"Shivtej",10000);
		Employee e2=new Employee(2,"Shiv",20000);
		Employee e3=new Employee(3,"Tej",30000);
		
		 // Store them in an array
        Employee[] employees = {e1, e2, e3};

        // Iterate and display data
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() +
                               ", Name: " + emp.getName() +
                               ", Salary: " + emp.getSal());
		}
	}
}