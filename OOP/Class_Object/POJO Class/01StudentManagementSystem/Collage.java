package com.tot;
import java.util.*;

public class Collage{
	Scanner sc=new Scanner(System.in);
	Student[] s;
	public void accept(Student...s){
		this.s=s;
	}
	public void addStudent(){
		for(int i=0;i<s.length;i++){
			
			System.out.println("Enter a Id,name,email,contact,course,marks");
			int id=sc.nextInt();
			String name=sc.next();
			String email=sc.next();
			String contact=sc.next();
			String course=sc.next();
			int marks=sc.nextInt();
			
			s[i]=new Student(id,name,email,contact,course,marks);
			System.out.println("Student add Succesfull");
			System.out.println("--------------------------------------------------------");
		}
	}
}