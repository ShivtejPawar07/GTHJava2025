package com.tot;

public class ProductApp {

	public static void main(String[] args) {
		Product p1=new Product("ABC",1000,10);
		Product p2=new Product("ABC",2000,10);
		ProductDisc pd=new ProductDisc();
		pd.accept(p1,p2);
		pd.discPrice();

	}

}
