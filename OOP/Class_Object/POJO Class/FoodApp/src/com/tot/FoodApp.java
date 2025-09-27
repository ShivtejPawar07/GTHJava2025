package com.tot;
import java.util.*;
public class FoodApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Food[] f=new Food[3];
		FoodOper fo=new FoodOper();
		fo.accept(f);
		int ch;
		do {
			System.out.println("1 : Add All Food details.");
			System.out.println("2 : Display All Food details.");
			System.out.println("3 : Display Bill Details:");
			System.out.println("    1 : Bill Without GST");
			System.out.println("    2 : Bill With 18% GST");
			System.out.println("4 : Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:fo.addFood();
			break;
			case 2:fo.Display();
			break;
			case 3:fo.displayBillMenu();
			break;
			case 4:System.out.println("Exit");
			break;
			default:System.out.println("Invalid choice");
			break;
			}
			
		}while(ch!=4);
		
		
	}

}
