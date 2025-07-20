/*Q20. Given a number, print Perfect Square if its square root is an integer, 
otherwise Not Perfect Square — using ternary operators.*/
import java.util.*;
class PerfectSq{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int n=sc.nextInt();
	double sq=Math.sqrt(n);
	if(sq*sq==n){
	System.out.println(n +"is perfect square number");   
	}else{
	System.out.println(n +"is not perfect square number");   
	}
  }
}