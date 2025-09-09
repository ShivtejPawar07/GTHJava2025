/*19Write a function to check if a number is a strong number (sum of factorial of digits = number).
*/
import java.util.*;
class Strong{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		boolean s=strong(n);
		if(s)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");
	}
	public static boolean strong(int n){
		int sum=0,temp=n;
		while(n!=0){
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		return sum==temp;
	}
}