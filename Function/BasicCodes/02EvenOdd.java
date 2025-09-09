/*Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/
import java.util.*;
class Even{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		boolean even=isEven(n);
		if(even)
			System.out.println("Even");
		else
			System.out.println("odd");
	}
	public static boolean isEven(int n){
		return n%2==0;
	}
}