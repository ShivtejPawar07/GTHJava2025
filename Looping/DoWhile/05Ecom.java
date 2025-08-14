/***5. E-commerce Checkout Simulation**

**Description:**

* Display a list of items with prices.
* Use a do-while loop to let the user keep adding items to the cart until they type "checkout".
* If they type "skip", use **continue** to skip adding that item.
* On checkout, print the total and exit the loop.

*/
import java.util.*;
class Ecommerce{
	public static void main(String x[]){
		Scanner	sc=new Scanner(System.in);
		int bill=0;
		String ch;
		do{
			System.out.println("1:PD cost:200");
			System.out.println("2:HD cost:2200");
			System.out.println("3:SSD cost:2000");
			System.out.println("4:CD cost:20");
			System.out.println("Checkout for exit");
			System.out.println("Enter your choice");
			ch=sc.nextLine();
			ch=ch.toLowerCase();
			switch(ch){
				case "1":bill+=200;
				break;
				
				case "2":bill+=2200;
				break;
				
				case "3":bill+=2000;
				break;
				
				case "4":bill+=20;
				break;
				
				case "checkout":System.out.println("Total Bill:"+bill);
				break;
				
				case "skip":break;
				
				default:
					if(ch.equalsIgnoreCase("skip")==false)
						System.out.println("Wrong Choice");
			}
			 
			
		}while(ch.equalsIgnoreCase("checkout")==false);
	}
}