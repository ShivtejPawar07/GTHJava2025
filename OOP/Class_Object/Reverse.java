/*11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/
import java.util.*;
class Reverse{
	int reverse(int n){
		int rev=0;
		while(n!=0){
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Reverse r=new Reverse();
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		System.out.println("Reverse="+r.reverse(n));
	}
}