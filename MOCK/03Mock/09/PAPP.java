import java.util.*;
public class PAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		Product[] p=new Product[2];
		
		for(int i=0;i<p.length;i++){
			System.out.println("enter id name price");
			int id=sc.nextInt();
			String name=sc.next();
			double price=sc.nextDouble();
			p[i]=new Product();
			p[i].setProductId(id);
			p[i].setProductName(name);
			p[i].setPrice(price);
			
		}
		ProductService ps=new ProductService();
		ps.accept(p);
		ps.calculateDiscount();
		ps.displayProductDetails();
	}
}