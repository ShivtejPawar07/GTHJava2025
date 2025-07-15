/*Write a Java program to input cost price and selling price of a product and check profit or loss.*/
import java.util.*;
public class ProLoss{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Cost price");
	double cp=sc.nextDouble();
	System.out.println("Enter the Selling price");
	double sp=sc.nextDouble();
	
    String result=sp>cp?"seller made a profit:"+(sp-cp):
                   	"seller made a loss:"+(cp-sp);
			System.out.println(result);

  }
}