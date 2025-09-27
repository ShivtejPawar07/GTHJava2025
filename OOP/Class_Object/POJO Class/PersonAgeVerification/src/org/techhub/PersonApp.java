package org.techhub;

import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person[] p=new Person[3];
		for(int i=0;i<p.length;i++) {
			System.out.println("Enter Name age");
			String name=sc.next();
			int age=sc.nextInt();
			
			p[i]=new Person(name,age);
		}
		System.out.println("Name\tAge");
		for(int i=0;i<3;i++) {
			if(p[i].getAge()>=18) {
			System.out.println(p[i].getName()+"\t"+p[i].getAge());
		}
		}
	}
}
