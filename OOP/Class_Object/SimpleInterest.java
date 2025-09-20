/*5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal,
 rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/
import java.util.*;
class SimpleI{
	int calculate(int p,int r,int t){
		return (p*r*t)/100;
	
	}
}
class SimpleInterest{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		SimpleI s=new SimpleI();
	
		System.out.println("Enter principal,rate,time");
		int p=sc.nextInt();
		int i=sc.nextInt();
		int t=sc.nextInt();
		
		System.out.println("SimpleInterest="+s.calculate(p,i,t));
	}
}