/*43Mobile plan billing system:

Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.*/

import java.util.*;
class Mobile{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Minutes used in a month");
	int min=sc.nextInt();
	
	if(min>=1 && min<=100)
	  System.out.println("Total monthly bill:"+199);
	  
	else if(min>=101 && min<=300)
      	System.out.println("Total monthly bill:"+(199+(min-100)*1));
	                                           //199+(125-100)*1=224
		
    else if(min>301 && min<=500)
 	System.out.println("Total monthly bill:"+(199+(200*1)+(min-300)*1.5));
	                                          //
	else if(min>500)
	  System.out.println("Total monthly bill:"+(199+200+200*1.5+(min-500)*2));
	  
	
	
  }
}