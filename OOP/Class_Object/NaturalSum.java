/*20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula.
*/
import java.util.*;
class  NaturalSum{
	int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		return sum;
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		NaturalSum ns=new NaturalSum();
		System.out.println("Sum="+ns.calculateSum(n));
	}
}