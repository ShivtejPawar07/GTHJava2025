package org.techhub;

public class Employee {
	private String name;
	private String dept;
	private int sal;
	
	public Employee(String name,String dept,int sal) {
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getSal() {
		return sal;
	}
}
