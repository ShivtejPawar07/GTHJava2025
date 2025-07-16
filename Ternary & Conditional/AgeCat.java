/*Q53.Given age, print category:

Teen (13–19)
Adult (20–59)
Senior (60+)*/
import java.util.*;
public class AgeCat{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the score");
	 int a=sc.nextInt();
	
	 String result=(a>=13 && a<=19) ? "Teen":
				   (a>=20 && a<=59)?"Adult":
				   "senior";
				
				 
	 System.out.println(result);
  
  }
}