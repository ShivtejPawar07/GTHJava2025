/*Calculate total bill with tax and discount

Note tax =12% to billing amount and give discount 5% on billing amount If billing amount is 100Rs then discount is 5 and tax is 12Rs.

Total bill is 107Rs

*/
import java.util.*;

public class GstDicApp {
  public static void main(String[] x) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Quantity:");
    double qty = sc.nextDouble();

    System.out.println("Enter the Rate:");
    double rate = sc.nextDouble();

    double total = qty * rate;          // Original amount //100
    double gst = total * 0.12;          // GST = 12% of total 12
    double discount = total * 0.05;     // Discount = 5% of total  5

    double finalAmount = total + gst - discount;//100+12-5=107

    System.out.println("Total without GST and discount = " + total);
    System.out.println("GST (12%) = " + gst);
    System.out.println("Discount (5%) = " + discount);
    System.out.println("Total bill with GST and after discount = " + finalAmount);
  }
}
