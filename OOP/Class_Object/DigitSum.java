/*17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.*/
import java.util.*;
class  DigitSum{
	int calculateSum(int n){
		int sum=0;
		while(n!=0){
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		DigitSum ds=new DigitSum();
		System.out.println("Sum="+ds.calculateSum(n));
		
	}
}

