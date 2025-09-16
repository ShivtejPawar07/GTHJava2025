/*10Write a program to count the number of digits in a given number using recursion.
*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int r=count(n);
		System.out.println("CountOfDigit="+r);
	}
	public static int count(int n){

		if(n==0){
			return 0;
		}
		return 1+count(n/10);
	}
}