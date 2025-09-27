package com.tot;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String contact;
	private int sal;
	public Employee(int id,String name,String email,String contact,int sal) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getContact() {
		return contact;
	}
	public int getSal() {
		return sal;
	}

}
