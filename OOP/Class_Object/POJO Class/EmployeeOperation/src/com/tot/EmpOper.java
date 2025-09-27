package com.tot;

public class EmpOper {
	Employee[] emp;
	public void accept(Employee... emp) {
		this.emp=emp;
	}
	public void grossSal() {
		for(int i=0;i<emp.length;i++) {
			System.out.println("Id="+emp[i].getId());
			System.out.println("Name="+emp[i].getName());
			System.out.println("Basic Sal="+emp[i].getBs());
			System.out.println("Hra="+emp[i].getHra());
			System.out.println("DA="+emp[i].getDa());
			System.out.println("Gross Sal="+(emp[i].getBs()+emp[i].getHra()+emp[i].getDa()));
			System.out.println("----------------------------------------------------");
		}
	}
	public void maxSal() {
		Employee topsal=null; 
		float max=0;
		for(int i=0;i<emp.length;i++) {
			float gs=emp[i].getBs()+emp[i].getHra()+emp[i].getDa();
			if(gs>max) {
				max=gs;
				topsal=emp[i];
			}
		}
		if(topsal!=null) {
			System.out.println("Id="+topsal.getId());
			System.out.println("Name="+topsal.getName());
			System.out.println("Basic Sal="+topsal.getBs());
			System.out.println("Hra="+topsal.getHra());
			System.out.println("DA="+topsal.getDa());
			System.out.println("Gross Sal="+(topsal.getBs()+topsal.getHra()+topsal.getDa()));
			System.out.println("Maximum Salary"+max);
		}
	}
	public void avgSal() {
		Employee topemp=null;
		int sum=0;
		for(int i=0;i<emp.length;i++) {
			float gs=emp[i].getBs()+emp[i].getHra()+emp[i].getDa();
			sum+=gs;
		}
		float avg=sum/emp.length;
		
		for(int i=0;i<emp.length;i++) {
			float gs=emp[i].getBs()+emp[i].getHra()+emp[i].getDa();
			if(avg<=gs) {
				topemp=emp[i];
			}
		}
		if(topemp!=null) {
			System.out.println("Print the details of employees whose salary is greater than the average salary of all employees.");
			System.out.println("Id="+topemp.getId());
			System.out.println("Name="+topemp.getName());
			System.out.println("Basic Sal="+topemp.getBs());
			System.out.println("Hra="+topemp.getHra());
			System.out.println("DA="+topemp.getDa());
			System.out.println("Gross Sal="+(topemp.getBs()+topemp.getHra()+topemp.getDa()));
	}
}
}
