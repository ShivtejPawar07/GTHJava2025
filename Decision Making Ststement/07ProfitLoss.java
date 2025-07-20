/*Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.
*/
import java.util.*;
class ProLoss{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the SP CP");
	  int sp=sc.nextInt();
	   int cp=sc.nextInt();
	   
	  if(sp>cp){
	  System.out.println("seller made a profit:"+(sp-cp));
	  }
	  else {
	    System.out.println("seller made a loss:"+(cp-sp));
	  }
   
   }
}
