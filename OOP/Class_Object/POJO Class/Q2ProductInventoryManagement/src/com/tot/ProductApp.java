package com.tot;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product[] p = new Product[10];

		p[0] = new Product(1, "Laptop", "Electronics", 45000, 5);
		p[1] = new Product(2, "Phone", "Electronics", 25000, 10);
		p[2] = new Product(3, "Shirt", "Clothing", 1200, 20);
		p[3] = new Product(4, "Shoes", "Footwear", 2500, 15);
		p[4] = new Product(5, "Bag", "Accessories", 1800, 8);
		p[5] = new Product(6, "Watch", "Accessories", 5000, 12);
		p[6] = new Product(7, "Tablet", "Electronics", 15000, 7);
		p[7] = new Product(8, "Jeans", "Clothing", 1800, 18);
		p[8] = new Product(9, "Headphones", "Electronics", 3500, 9);
		p[9] = new Product(10, "Jacket", "Clothing", 3000, 6);

	//	Product[]s=new Product[3];
		
		
		Company co=new Company();
		co.accept(p);
		int ch=0;
		do {
			System.out.println("1. Add Product Details.");
			System.out.println("2. Display All Product Details.\\");
			System.out.println("3. Search Product");
			System.out.println("   1. Id");
			System.out.println("   2. Name");
			System.out.println("4. Delete Product .");
			System.out.println("   1. Category");
			System.out.println("   2. price < 100.");
			System.out.println("5. Update Product");
			System.out.println("   1. Id → update quantity.");
			System.out.println("   2. Name → update price.");
			System.out.println("6. Sort Products:");
			System.out.println("   1. By id ascending.");
			System.out.println("   2. By price descending");
			System.out.println("7. Display most expensive product.");
			System.out.println("8. Display products with price range 1000–5000.");
			System.out.println("9.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1:co.addProduct();
				break;
				
				case 2:co.displayProduct();
					break;
					
				case 3:co.searchProduct();
					break;
					
				case 4:co.productDelete();
					break;
					
				case 5:co.productUpdate();
					break;
					
				case 6:co.sortProduct();
					break;
					
				case 7:co.expProduct();
					break;
					
				case 8:co.rangeProduct();
					break;
					
				case 9:System.out.println("Exit.....!");
					break;
					
					default:System.out.println("Invalid choice");
						break;
			}
		}while(ch!=9);

	}

}
