
import java.util.*;
import org.tech.Product;

public class ProductApp{
	public static void main(String[]x){
		Vector v=new Vector();
		
		v.add(new Product(1,"Shivtej",100000));
		v.add(new Product(2,"Shivaa",200000));
		v.add(new Product(3,"Shivtejya",300000));
		v.add(new Product(4,"Shiv",400000));
		v.add(new Product(5,"tej",500000));
		
		for(Object obj:v){
			Product p=(Product)obj;
			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getPrice());

		}
	}

}