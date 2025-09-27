package com.tot;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1=new  Employee(1,"shivtej",10000,10,20);
		Employee e2=new  Employee(2,"tej",100000,10,20);
		Employee e3=new  Employee(3,"shiv",1000,10,20);
		EmpOper eo=new EmpOper();
		eo.accept(e1,e2,e3);
		eo.grossSal();
		eo.maxSal();
		eo.avgSal();
	}

}
