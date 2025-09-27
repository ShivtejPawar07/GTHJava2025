import java.util.*;
class Employee{
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id,String name,int sal){
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
		Scanner sc=new Scanner(System.in);
		 Employee emp[]=new Employee[5];
		
		for(int i=0;i<emp.length;i++){
			System.out.println("Enter the Employee id name sal");
			int id=sc.nextInt();
			String name=sc.next();
			int sal=sc.nextInt();
			
			emp[i]=new Employee(id,name,sal);//use constructor
		}
		
		System.out.println("Display employee info");
		System.out.println("Id\tName\tSal");
		for(int i=0;i<emp.length;i++){
			System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
		}
		
	}
}