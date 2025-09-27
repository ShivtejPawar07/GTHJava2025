class Employee{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSal(int sal){
		this.sal=sal;
	}
	public int getSal(){
		return sal;
	}
	
}
class Company{
	private Employee emp;
	void addnewEmp(Employee emp){
		this.emp=emp;
	}
	void showData(){
		System.out.println(emp.getId()+emp.getName()+emp.getSal());
	}
}
class Demo{
	public static void main(String x[]){
		Company c=new Company();
		Employee e=new Employee();
		e.setId(1);
		e.setName("Shivtej");
		e.setId(100000000);
		c.addnewEmp(e);
		c.showData();
	}
}