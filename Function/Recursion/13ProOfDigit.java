/*13Write a program to find the product of digits of a given number using recursion.
*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=pro(n,1);
		System.out.println("Product Of Digit="+r);
	}
	public static int pro(int n,int p){
		if(n!=0){
			int rem=n%10;
			p*=rem;
			return pro(n/10,p);
		}
		return p;
	}
}