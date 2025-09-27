package com.tot;
public class Employee {
	private int id;
	private String name;
	private int bs;
	private int hra;
	private int da;
	public Employee(int id,String name,int bs,int hra,int da) {
		this.id=id;
		this.name=name;
		this.bs=bs;
		this.hra=hra;
		this.da=da;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBs() {
		return bs;
	}
	public int getHra() {
		return hra;
	}
	public int getDa() {
		return da;
	}
}
