/*Calculate total bill with tax and discount
Note tax =12% to billing amount and give discount 5% on billing amount 
If billing amount is 100Rs then discount is 5 and tax is 12Rs.Total bill is 107Rs
*/
import java.util.*;
class TaxBill{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Billing amt");
		int amt=sc.nextInt();
		
		float dis=amt*0.05f;
		
		float tax=amt*0.12f;
		
		float total=(amt-dis)+tax;
		
		System.out.println(total);
		
	}
}