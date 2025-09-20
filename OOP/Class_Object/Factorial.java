/*12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/
import java.util.*;
class Factorial{
	int findFactorial(int n){
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		return f;
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Factorial f=new Factorial();
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		System.out.println("Factorial="+f.findFactorial(n));
	}
}