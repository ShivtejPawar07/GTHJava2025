package org.techhub;
import java.util.*;
public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] emp=new Employee[3];
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter Name Department Sal");
			String name=sc.next();
			String dept=sc.next();
			int sal=sc.nextInt();
			
			emp[i]=new Employee(name,dept,sal);
		}
		System.out.println("Name\tDepartment\tSal");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].getName()+"\t"+emp[i].getDept()+"\t"+emp[i].getSal());
		}
		System.out.println("Updated salary");
		System.out.println("Name\tDepartment\tSal");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].getName()+"\t"+emp[i].getDept()+"\t"+(emp[i].getSal()*0.10+emp[i].getSal()));
		}
	}

}
