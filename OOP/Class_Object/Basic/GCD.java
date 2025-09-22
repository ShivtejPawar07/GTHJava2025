/*19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.
*/
import java.util.*;
class Gcd{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Gcd g=new Gcd();
		System.out.println("Enter Two Number");
		int n1=sc.nextInt();//10
		int n2=sc.nextInt();//5
		g.findGCD(n1,n2);
		System.out.println("Gcd:"+g.findGCD(n1,n2));
	}
	void findGCD(int n1,int n2){
		int i=1,gcd=0;
		while(i<=n1 && i<=n2){
		  if(n1%i==0 && n2%i==0){
			gcd=i;
		  }
		  i++;
		}
		return gcd;
	}
}