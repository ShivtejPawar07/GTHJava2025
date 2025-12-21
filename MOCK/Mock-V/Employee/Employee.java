/*2. Write a menu driven program in java to Create a class name as Employee to hold empid, empname , 
empemail , empcontact and empsalry. 
    
The menu options should be:  
 1. Add Employee Details. 
 2. Display All Employee Details. 
 3. Search Employee By Id then employee is found or not. 
 4. Update Employee Details By empcontact. 
 5. Delete Employee Details By empsalary. */
 
package org.tech;
public class Employee{
	private int id;
	private	String name;
	private String mail;
	private String con;
	private double sal;
	
	public Employee(int id,String name,String mail,String con,double sal){
		this.id=id;
		this.name=name;
		this.mail=mail;
		this.con=con;
		this.sal=sal;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getMail(){
		return mail;
	}
	public String getCon(){
		return con;
	}
	public double getSal(){
		return sal;
	}
}