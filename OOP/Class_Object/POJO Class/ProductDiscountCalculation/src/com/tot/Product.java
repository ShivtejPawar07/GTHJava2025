package com.tot;

public class Product {
	private String name;
	private int price;
	private float disper;
	
	public Product(String name,int price,float disper) {
		this.name=name;
		this.price=price;
		this.disper=disper;
	}
	public String getName() {
		return name;	
	}
	public int getPrice() {
		return price;
	}
	public float getDisper() {
		return disper;
	}

}
