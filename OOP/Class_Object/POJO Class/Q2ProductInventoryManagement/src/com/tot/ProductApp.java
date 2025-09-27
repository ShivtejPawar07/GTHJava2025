package com.tot;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product[]s=new Product[3];
		Company co=new Company();
		co.accept(s);
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
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					break;
					
				case 7:
					break;
					
				case 8:
					break;
					
				case 9:System.out.println("Exit.....!");
					break;
					
					default:System.out.println("Invalid choice");
						break;
			}
		}while(ch!=9);

	}

}
