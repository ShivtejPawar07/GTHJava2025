/*Q9Write a program to calculate the sum of digits of a given number using recursion.
*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=sum(n,0);
		System.out.println("SumOfDigit="+r);
	}
	public static int sum(int n,int s){
		if(n!=0){
			int rem=n%10;
			s+=rem;
			return sum(n/10,s);
		}
		return s;
	}
}