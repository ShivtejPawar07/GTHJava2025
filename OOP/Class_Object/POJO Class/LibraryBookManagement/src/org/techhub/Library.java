package org.techhub;
import java.util.*;
public class Library {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		Book[] b=new Book[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter Book Title author price");
			String title=sc.next();
			String author=sc.next();
			int price=sc.nextInt();
			
			b[i]=new Book(title,author,price);
		}
		if(b[0].getPrice()>b[1].getPrice()) {
			System.out.println("Book\tTitle\tPrice");
			System.out.println(b[0].getTitle()+"\t"+b[0].getAuthor()+"\t"+b[0].getPrice());
		}
		else {
			System.out.println("Book\tTitle\tPrice");
				System.out.println(b[1].getTitle()+"\t"+b[1].getAuthor()+"\t"+b[1].getPrice());
	}
}
}
