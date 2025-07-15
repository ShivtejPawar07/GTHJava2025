/*Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.
*/
import java.util.*;
public class PerfectSquare{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	 int sqrt=(int)Math.sqrt(n);//sqrt : inbuilt double aahe mahun int typecast kele
    String result=sqrt*sqrt==n?"Number is perfect square":
                   	"Number is not perfect square";
			System.out.println(result);

  }
}