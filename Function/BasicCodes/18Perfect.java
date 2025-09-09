/*18Write a function to check if a number is a perfect number.
*/
import java.util.*;
class Perfect{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		boolean p=perfect(n);
		if(p)
			System.out.println("Perfect");
		else
			System.out.println("Not Perfect");
		
	}
	public static boolean perfect(int n){
	int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				sum+=i;
		}
		return sum==n;
	}
}