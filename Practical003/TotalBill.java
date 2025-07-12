/*Calculate total bill with tax and discount
Note tax =12% to billing amount and give discount 5% on billing amount If billing amount is 100Rs then discount is 5 and tax is 12Rs.

Total bill is 107Rs

*/
public class TotalBill {
    public static void main(String[] x) {
        int qty = Integer.parseInt(x[0]);     // Quantity
        int rate = Integer.parseInt(x[1]);    // Rate per item
        int total = qty * rate;                 // Total without tax and discount

        double gst = 0.12 * total;              // 12% GST
        double discount = 0.5 * total;         // 5% Discount
        double finalAmount = total + gst - discount;

        System.out.println("Total before tax and discount: " + total);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill : " + finalAmount);
    }
}
