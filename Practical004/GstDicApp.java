/*Calculate total bill with tax and discount
Note tax =12% to billing amount and give discount 5% on billing amount If billing amount is 100Rs then discount is 5 and tax is 12Rs.
Total bill is 107Rs
*/
import java.util.*;
public class GstDicApp{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Quantity");
	double qty=sc.nextDouble();
	System.out.println("Enter the Rate");
	double rate=sc.nextDouble();
	
	double total=qty*rate;//100
	
	double gst=total*0.12;//100*0.12=12
	
	double gstTotal=total+gst;//100+12=112
	
	double dis=gstTotal*0.05;//112*0.05
	
	int disTotal=(int)(gstTotal-dis);
	
	
	System.out.println("Total without gst and discount="+total);
	System.out.println("Total with gst and without discount="+gstTotal);
	System.out.println("Total with gst and with discount="+disTotal);
	
	
  }
}
