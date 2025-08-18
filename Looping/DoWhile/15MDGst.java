/*Q5.Write a menu-driven program using switch and do-while to perform:
Enter product price and quantity, calculate total bill
Apply discount (10% if bill > ₹1000)
Calculate GST on bill amount (18%)
Compare final bill amount with a given value
Exit the program
*/
import java.util.*;
class MD{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product price");
		double p=sc.nextDouble();
		System.out.println("Enter the Quantity");
		int q=sc.nextInt();
		double bill = p * q;
        double finalBill = bill;  // will change after discount / GST
        int ch;
		
		do{
			System.out.println("1:Apply discount (10% if bill > ₹1000)");
			System.out.println("2:Calculate GST on bill amount (18%)");
			System.out.println("3:Compare final bill amount with a given value");
			System.out.println("4:Exit");
			System.out.println("Enter a choice");
			ch=sc.nextInt();
			
			switch(ch){
				case 1:
					if (bill > 1000) {
                        finalBill = bill - (bill * 0.10);
                        System.out.println("Discount Applied Bill after discount = " + finalBill);
                    } else {
                        finalBill = bill;
                        System.out.println("No discount applied. Bill = " + finalBill);
                    }
                 
				break;
				case 2:
					double gst = finalBill * 0.18;
                    finalBill += gst;
                    System.out.println("GST Added (18%) = " + gst);
                    System.out.println("Bill after GST = " + finalBill);
						
				break;
				case 3:
				    System.out.println("Enter the value to compare with final bill: ");
                    double value = sc.nextDouble();
                    if (finalBill > value)
                        System.out.println("Final Bill (" + finalBill + ") is greater than " + value);
                    else if (finalBill < value)
                        System.out.println("Final Bill (" + finalBill + ") is less than " + value);
                    else
                        System.out.println("Final Bill is equal to " + value);
                  
						
				break;
				case 4:
						System.out.println("Thank you Visit again");
				break;
				
				default:
				System.out.println("Invalid Choice");
			}
			
			
		}while(ch!=4);	
		
		
		
	}
}