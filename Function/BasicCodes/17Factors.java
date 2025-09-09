/*Q17 a function to print the factors of a number.
*/
import java.util.*;
class Factor{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		factor(n);
		
	}
	public static void factor(int n){
		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
}