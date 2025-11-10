/*9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.
EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.
Explanation:
 Tests inheritance where logic changes depending on product type.
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
	void calculatePrice(){
	
	}
}
class LuxuryProduct extends Product{
	LuxuryProduct(int id,String name,int price){
		super(id,name,price);
	}
	void calculatePrice(){
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		System.out.println("Total Price 20% tax="+(price*0.20+price));
	}
}
class EssentialProduct extends Product{
	EssentialProduct(int id,String name,int price){
		super(id,name,price);
	}
	void calculatePrice(){
	System.out.println("Id="+id);	
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		System.out.println("Total Price 5% GST="+(price*0.05+price));
	}
}
class ProApp{
	public static void main(String[]x){
		LuxuryProduct m=new LuxuryProduct(1,"Shivtej",1000);
		m.calculatePrice();
		
		EssentialProduct b=new EssentialProduct(2,"Shiv",1000);
		b.calculatePrice();
		
	}
}