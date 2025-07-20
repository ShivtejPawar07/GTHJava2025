/*Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                       For first 50 units Rs. 0.50/unit
                       For next 100 units Rs. 0.75/unit
                       For next 150 units Rs. 1.20/unit
                       For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.*/

import java.util.*;
class Electricity{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter electricity unit");
	int unit=sc.nextInt();
	double bill;
	
	if(unit<=50){
		bill=unit*0.50;
	}
	else if(unit<=150){
		bill=50*0.50+(unit-50)*0.75;
	}
	else if(unit<=250){
		bill=50*0.50+100*0.75+(unit-100)*1.20;
	}
	else{
		bill=50*0.50+100*0.75+100*1.20+(unit-250)*1.50;
	}
	
	double surcharge=bill*0.20;
	double total=surcharge+bill;
	
	System.out.println("Base bill = Rs. " + bill);
    System.out.println("Surcharge (20%) = Rs. " + surcharge);
    System.out.println("Total Bill = Rs. " + total);
	
  }
}