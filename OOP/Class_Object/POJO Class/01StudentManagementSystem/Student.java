package com.tot;

public class Student {
	private int id;
	private String name;
	private String email;
	private String contact;
	private String course;
	private int marks;
	
	public Student(int id,String name,String email,String contact,String course,int marks) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.course=course;
		this.marks=marks;
	}
	public int getId() {
		return  id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getContact(){
		return contact;
	}
	public String getCourse() {
		return course;
	}
	public int getMarks() {
		return marks;
	}
	
}
