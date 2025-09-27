package com.tot;

public class ProductDisc {
	Product[] p;
	public void accept(Product...p) {
		this.p=p;
	}
	public void discPrice() {
		for(int i=0;i<p.length;i++) {
		System.out.println("Name="+p[i].getName());
		System.out.println("Price="+p[i].getPrice());
		System.out.println("Discount Price="+(p[i].getPrice()-p[i].getPrice()*p[i].getDisper()/100));
		System.out.println("--------------------------------------------------------------");
	}
	
}
}
