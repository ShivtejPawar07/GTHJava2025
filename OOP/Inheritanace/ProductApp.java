/*3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics 
 (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
 */
class Product{
	int id;
	String name;
	int price;
	Product(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void getProduct(){
	
	}
}
class Electronics extends Product{
		Electronics(int id,String name,int price){
		super(id,name,price);
	}
	void getProduct(){
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		System.out.println("dis Price="+(price*0.10));
		System.out.println("Total Price="+(price+price*0.10));
	}
}
class Clothing extends Product{
	Clothing(int id,String name,int price){
		super(id,name,price);
	}
	void getProduct(){
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		System.out.println("dis Price="+(price*0.20));
		System.out.println("Total Price="+(price+price*0.10));
	}
}
class ProductApp{
	public static void main(String x[]){
		Clothing c=new Clothing(1,"Shivtej",1000);
		c.getProduct();
		
		Electronics e=new Electronics(2,"Shiv",1000);
		e.getProduct();
	}
}