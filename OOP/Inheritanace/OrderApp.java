/*6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.
Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.
Explanation:
Tests overriding with additional logic and conditional calculations in subclasses.*/
 
class Order{
	int id;
	int amt;
	void setDatalis(int id,int amt){
		this.id=id;
		this.amt=amt;
	}
	void calculateBill(){
		
	}
}
class CODOrder extends Order{
	void calculateBill(){
		System.out.println("Id="+id);
		System.out.println("amount="+amt);
		System.out.println("Final Bill="+(amt+50));
		
	}
}
class OnlinePaymentOrder extends Order{
	void calculateBill(){
		System.out.println("Id="+id);
		System.out.println("amount="+amt);
		System.out.println("Final Bill="+(amt-amt*0.05));
		
	}
}
class OrderApp{
	public static void main(String x[]){
		CODOrder co=new CODOrder();
		co.setDatalis(1,10000);
		co.calculateBill();
		
		OnlinePaymentOrder op=new OnlinePaymentOrder();
		op.setDatalis(1,10000);
		op.calculateBill();
		
	}
}