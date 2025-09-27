package com.tot;
	
public class Student {
	private int rn;
	private String name;
	private int marks[];
	
	public Student(int rn,String name,int marks[]) {
		this.rn=rn;
		this.name=name;
		this.marks=marks;
	} 
	public int getRn() {
		return rn;
	}
	public String getName() {
		return name;
	}
	public int[] getMarks() {
		return marks;
	}
}
