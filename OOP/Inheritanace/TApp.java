/*7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.

BusTicket has 5% GST.
 Print ticket price including tax using overridden methods
 */
import java.util.*;
class Ticket{
	String name;
	int price;
	Ticket(String name,int price){
		this.name=name;
		this.price=price;
	}
	void calculatePrice(){
	
	}
}
class MovieTicket extends Ticket{
	MovieTicket(String name,int price){
		super(name,price);
	}
	void calculatePrice(){
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		System.out.println("Total Price 18% GST="+(price*0.18+price));
	}
}
class BusTicket extends Ticket{
	BusTicket(String name,int price){
		super(name,price);
	}
	void calculatePrice(){
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		System.out.println("Total Price 5% GST="+(price*0.05+price));
	}

}
class TApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name  and price");
		String n=sc.next();
		int p=sc.nextInt();
		MovieTicket m=new MovieTicket(n,p);
		m.calculatePrice();
		
		BusTicket b=new BusTicket(n,p);
		b.calculatePrice();
		
	}
}
