package com.tot;
import java.util.*;
public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[]e=new Employee[3];
		EmpOper eo=new EmpOper();
		eo.accept(e);
		int ch=0;
		do {
			System.out.println("1. Add Employee Details.");
			System.out.println("2. Display All Employee Details.\\");
			System.out.println("3. Search Employee By Id then employee is found or not.");
			System.out.println("4. Update Employee Details By Name.");
			System.out.println("5. Delete Employee Details By Email.\r\n");
			System.out.println("6. Display list count of the Employee in Company.");
			System.out.println("7. Display list the employee in the ascending order of employee salary..");
			System.out.println("8. Display the employee details in highest salary.\r\n");
			System.out.println("9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.\r\n");
			System.out.println("10.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1:eo.addEmp();
				break;
				
				case 2:eo.displayEmp();
					break;
					
				case 3:eo.searchId();
					break;
					
				case 4:eo.updateName();
					break;
					
				case 5:eo.deleteEmp();
					break;
					
				case 6:eo.countEmp();
					break;
					
				case 7:eo.asending();
					break;
					
				case 8:eo.maxSal();
					break;
					
				case 9:eo.rangeSal();
					break;
					
				case 10:System.out.println("Exit.....!");
					break;
					
					default:System.out.println("Invalid choice");
						break;
			}
		}while(ch!=10);
		
		
		
		

	}

}
