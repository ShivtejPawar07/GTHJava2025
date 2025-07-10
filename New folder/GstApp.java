public class GstApp{
  public static void main(String []x){
     int qty=Integer.parseInt(x[0]);
	 float rate=Float.parseFloat(x[1]);
	 
	 float total=qty+rate;
	 
	 
	 float gstamt=(total *18)/100;
	 System.out.println("gstamt="+gstamt);
	 
	 float gstBill=gstamt+total;
	 
	 System.out.println("total bill without gst="+total);
	 System.out.println("total bill with gst="+gstBill);
  }
}