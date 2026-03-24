package org.tech;
public class Employee{
	int id;
	String name;
	double bs;
	int rating;
	
	public Employee(int id,String name,double bs,int rating){
		this.id=id;
		this.name=name;
		this.bs=bs;
		this.rating=rating;
	}
	
	public int getId(){
		return id;
	}
		
	public String getName(){
		return name;
	}
		
	public double getBs(){
		return bs;
	}
		
	public int getRating(){
		return rating;
	}
}