package com.tot;
import java.util.*;
public class EmpOper {
	Scanner sc=new Scanner(System.in);
	Employee[]e;
	public void accept(Employee...e) {
		this.e=e;
	}
	public void addEmp() {
		for(int i=0;i<e.length;i++) {
			System.out.println("Enter Employee Id,name,email,contact,sal");
			int id=sc.nextInt();
			String n=sc.next();
			String em=sc.next();
			String c=sc.next();
			int s=sc.nextInt();
			
			e[i]=new Employee(id,n,em,c,s);
			System.out.println("Employee added succesfully....!");
		}
	}/*2Display*/
	public void displayEmp() {
		for(int i=0;i<e.length;i++) {
			if(e[i]!=null) {
			System.out.println("Display Employee Info");
			System.out.println("Id="+e[i].getId());
			System.out.println("Name="+e[i].getName());
			System.out.println("Email="+e[i].getEmail());
			System.out.println("Contact="+e[i].getContact());
			System.out.println("Salary="+e[i].getSal());
			System.out.println("-------------------------------------------------");
			}
		}
	}
	/*3. Search Employee By Id then employee is found or not.*/
	public void searchId() {
		System.out.println("Enter a Search Id");
		int skey=sc.nextInt();
		boolean flag=false;
		Employee foundemp=null;
		for(int i=0;i<e.length;i++) {
			if(skey==e[i].getId()) {
				flag=true;
				foundemp=e[i];
				break;
			}
		}
		if(flag==true && foundemp!=null) {
				System.out.println("Display Search Info");
				System.out.println("Id="+foundemp.getId());
				System.out.println("Name="+foundemp.getName());
				System.out.println("Email="+foundemp.getEmail());
				System.out.println("Contact="+foundemp.getContact());
				System.out.println("Salary="+foundemp.getSal());
				System.out.println("-------------------------------------------------");
		}
	}
	/*4. Update Employee Details By Name.*/
	public void updateName() {
		 System.out.println("Enter the Name of the employee to update:");
		 String name = sc.nextLine();
		for (int i = 0; i < e.length; i++) {
	        if (e[i] != null && e[i].getName().equalsIgnoreCase(name)) {
	            System.out.print("Enter new Id: ");
	            int id = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter new Name: ");
	            String n = sc.nextLine();

	            System.out.print("Enter new Email: ");
	            String em = sc.nextLine();

	            System.out.print("Enter new Contact: ");
	            String con = sc.nextLine();
	            
	            System.out.print("Enter new Sal: ");
	            int sal = sc.nextInt();
	            
	            sc.nextLine();

	            e[i] = new Employee(id,n,em,con,sal);
	            System.out.println("Employee details updated successfully!");
	            break;
	        }
	    }
		
			
		
	}/* 5. Delete Employee Details By Email */
	public void deleteEmp() {
	    System.out.println("Enter the email of the Emp to delete:");
	    String email = sc.next();

	    boolean found = false;

	    for (int i = 0; i < e.length; i++) {
	        if (e[i] != null && e[i].getEmail().equalsIgnoreCase(email)) {
	            // Shift elements left
	            for (int j = i; j < e.length - 1; j++) {
	                e[j] = e[j + 1];
	            }
	            e[e.length - 1] = null; // last slot becomes empty
	            found = true;
	            System.out.println("Employee deleted successfully.");
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("No employee found with the given email.");
	    }
	}
	/*6. Display list count of the Employee in Company.*/
	public void countEmp() {
		int count = 0;
	    for (int i = 0; i < e.length; i++) {
	        if (e[i] != null) {
	            count++;
	        }
	    }
	    System.out.println("Total number of Employee in the Compny: " + count);
	}
	/*7. Display list the employee in the ascending order of employee salary.*/
	public void asending() {
		 for (int i = 0; i < e.length - 1; i++) {
		        for (int j = i + 1; j < e.length; j++) {
		            if (e[i] != null && e[j] != null && e[i].getSal() > e[j].getSal()) {
		                Employee temp = e[i];
		                e[i] = e[j];
		                e[j] = temp;
		            }
		        }
		    }
	}
	/*8. Display the employee details in highest salary.*/
	public void maxSal() {
		int max=e[0].getSal();
		Employee maxemp=null;
		for(int i=0;i<e.length;i++) {
			if(e[i].getSal()>max) {
				max=e[i].getSal();
				maxemp=e[i];
			}
		}
		if(maxemp!=null) {
			System.out.println("Max Sal Emp Info");
			System.out.println("Id="+maxemp.getId());
			System.out.println("Name="+maxemp.getName());
			System.out.println("Email="+maxemp.getEmail());
			System.out.println("Contact="+maxemp.getContact());
			System.out.println("Salary="+maxemp.getSal());
			System.out.println("-------------------------------------------------");
		}
		
	}
	/*9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.*/
	public void rangeSal() {

		System.out.println("Employee with minimum salary is 10000 to maximum salary is 60000");
	    for (int i = 0; i < e.length; i++) {
	        if (e[i] != null && e[i].getSal() >= 10000 && e[i].getSal() <= 60000) {
	        	System.out.println("Display Employee Info");
				System.out.println("Id="+e[i].getId());
				System.out.println("Name="+e[i].getName());
				System.out.println("Email="+e[i].getEmail());
				System.out.println("Contact="+e[i].getContact());
				System.out.println("Salary="+e[i].getSal());
				System.out.println("-------------------------------------------------");
	        }
	    }
	}
	
}
