public class  ProductService{
	Product[] p;
	double dis;
	public void accept(Product... p){
		this.p=p;
	}
	public double calculateDiscount(){
		for(int i=0;i<p.length;i++){
			if(p[i].getPrice() >= 1000){
				dis=p[i].getPrice()*0.20;
				
			}
			else if(500 < p[i].getPrice() && p[i].getPrice() < 1000){
				dis=p[i].getPrice()*0.10;
				
			}
			else if(p[i].getPrice() < 500){
				dis=p[i].getPrice()*0.5;
				
			}
		}
		return dis;
	}
	public void displayProductDetails(){
		for(int i=0;i<p.length;i++){
			System.out.println("Product ID="+p[i].getProductId());
			System.out.println("Product Name="+p[i].getProductName());
			System.out.println("Price="+p[i].getPrice());
			System.out.println("Total="+(p[i].getPrice()- dis));
		}	
	}
}
/*class ProductService {
    // Method 1: Calculate discount based on price
    public double calculateDiscount(Product p) {
        double price = p.getPrice();
        double discount;

        if (price >= 1000)
            discount = price * 0.20;
        else if (price >= 500)
            discount = price * 0.10;
        else
            discount = price * 0.05;

        return discount;
    }

    // Method 2: Display product details
    public void displayProductDetails(Product p) {
        double discount = calculateDiscount(p);
        double finalPrice = p.getPrice() - discount;

        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Discount: " + discount);
        System.out.println("Final Price after Discount: " + finalPrice);
    }
}
*/