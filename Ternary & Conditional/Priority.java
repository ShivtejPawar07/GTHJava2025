/* Print Parity and Divisibility by 3.

Print :

"Even & Div by 3"
"Even"
"Div by 3"
"None"*/
import java.util.*;
public class Priority{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the num");
	 int n=sc.nextInt();
	 
	 String result=(n%3==0 && n%2==0)?"Even & Div by 3":
	               (n%2==0)?"Even":
	               (n%3==0)?"Div by 3":
				   "none";
				   System.out.println(result);
  
  }

}