/*14Write a program to find the sum of even numbers up to n using recursion.
*/
import java.util.*;
class Sum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=sum(n);
		System.out.println("Sum="+r);
	}
	public static int sum(int n){
		if(n==0){
			return 0;
		}
		if(n % 2 == 0) {
            return n + sum(n - 1);  // add even number
        } else {
            return sum(n - 1);  // skip odd number
        }
	}
}