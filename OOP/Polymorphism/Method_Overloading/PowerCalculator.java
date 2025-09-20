/*13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/
import java.util.*;
class PowerCalculator{
	int power(int b,int ind){
		int p=1;
		for(int i=1;i<=ind;i++){
			p=p*b;
		}
		return p;
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base and index");
		int base=sc.nextInt();
		int index=sc.nextInt();
		
		PowerCalculator pc=new PowerCalculator();
		System.out.println("power="+pc.power(base,index));
	}
}