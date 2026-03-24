package org.tech;
import java.util.*;
public class EmployeeOpr{
	Scanner sc=new Scanner(System.in);
	Employee[]e;
	public void accept(Employee[]e){
		this.e=e;
	}
	public void add(){
		for(int i=0;i<e.length;i++){
			System.out.println("Enter id,name,email,con,sal");
			int id=sc.nextInt();
			String name=sc.next();
			String mail=sc.next();
			String con=sc.next();
			double sal=sc.nextDouble();
			
			e[i]=new Employee(id,name,mail,con,sal);
		}
	}
	public void display(){
		for(int i=0;i<e.length;i++){
			System.out.println("Id"+e[i].getId());
			System.out.println("Name"+e[i].getName());
			System.out.println("Email"+e[i].getMail());
			System.out.println("Con"+e[i].getCon());
			System.out.println("Sal"+e[i].getSal());
		}
	}
	public void search(){
		System.out.println("Enter id");
		int id=sc.nextInt();
		for(int i=0;i<e.length;i++){
			if(id==e[i].getId()){
				System.out.println("Id Found");
			}
			else{
				System.out.println("Not Id Found");
			}
		}
	}

	/*4. Update Employee Details By Name.*/
	public void update() {
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
	public void delete() {
	    System.out.println("Enter the email of the Emp to delete:");
	    String email = sc.next();

	    boolean found = false;

	    for (int i = 0; i < e.length; i++) {
	        if (e[i] != null && e[i].getMail().equalsIgnoreCase(email)) {
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
	
}