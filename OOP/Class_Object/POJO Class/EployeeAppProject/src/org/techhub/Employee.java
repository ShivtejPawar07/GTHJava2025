package org.techhub;

public class Employee {
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id,String name,int sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
}

