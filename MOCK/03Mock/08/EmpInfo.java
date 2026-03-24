package tech.org;
public class EmpInfo{
	Employee[] e;
	double bonus;
	public void accept(Employee... e){
		this.e=e;
	}
	public void calculateBonus(){	
		for(int i=0;i<e.length;i++){
			if(e[i].getSalary() >= 100000)
				bonus = e[i].getSalary()*0.15;
			else if(e[i].getSalary() >= 50000 && e[i].getSalary()< 100000)
				 bonus = e[i].getSalary()*0.15;
			else if(e[i].getSalary() < 50000)
				 bonus = e[i].getSalary()*0.5;
		}
	}
	public void displayEmployeeDetails(){
		for(int i=0;i<e.length;i++){
		System.out.println("Id="+e[i].getId());
		System.out.println("Name="+e[i].getName());
		System.out.println("Salary ="+e[i].getSalary());
		System.out.println("Bonus ="+bonus);
		System.out.println("Total ="+(bonus+e[i].getSalary()));

	} 

	}
}