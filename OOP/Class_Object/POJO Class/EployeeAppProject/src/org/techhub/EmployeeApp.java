package org.techhub;
import java.util.Scanner;
public class EmployeeApp {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		Employee[] emp=new Employee[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter Employee id,name,sal");
			int id=sc.nextInt();
			String name=sc.next();
			int sal=sc.nextInt();
			
			emp[i]=new Employee(id,name,sal);
		}
		System.out.println("id\tname\tsal");
		for(int i=0;i<3;i++) {
			System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal());
		}
		sc.close();
	}
}
