package com.tot;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private String contact;
	private String address;
	
	public Customer(int cid,String cname,String email,String contact,String address) {
		this.cid=cid;
		this.cname=cname;
		this.email=email;
		this.contact=contact;
		this.address=address;
	}
	public int getcId() {
		return cid;
	}
	public String getcName() {
		return cname;
	}
	public String getEmail() {
		return email;
	}
	public String getContact() {
		return contact;
	}
	public String getAdress() {
		return address;
	}
}
