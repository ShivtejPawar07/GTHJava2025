/*WAP to create Employee POJO class with field id, name and salary and store  5 employee objects 
in Vector and display it.
*/
package org.tech;
public class Employee{
	private int id;
	private String name;
	private float sal;
	
	public Employee(int id,String name,float sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public float getSal(){
		return sal;
	}
}


