/* we want to create class name as Product with field id,name and price and store 5 product details in it and display it 
*/

package org.tech;
public class Product{
	private int id;
	private String name;
	private double price;
	
	public Product(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
}