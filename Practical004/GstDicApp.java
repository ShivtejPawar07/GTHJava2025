import java.util.*;

public class GstDicApp {
  public static void main(String[] x) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Quantity:");
    double qty = sc.nextDouble();

    System.out.println("Enter the Rate:");
    double rate = sc.nextDouble();

    double total = qty * rate;          // Original amount
    double gst = total * 0.12;          // GST = 12% of total
    double discount = total * 0.05;     // Discount = 5% of total

    double finalAmount = total + gst - discount;

    System.out.println("Total without GST and discount = " + total);
    System.out.println("GST (12%) = " + gst);
    System.out.println("Discount (5%) = " + discount);
    System.out.println("Total bill with GST and after discount = " + finalAmount);
  }
}
