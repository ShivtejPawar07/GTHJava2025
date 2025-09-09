/*Q16Write a function to calculate the factorial of a number (using loop only).
*/
import java.util.*;
class Fact{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int f=findFcat(n);
		System.out.println("Factorial="+f);
	}
	static int findFcat(int n){
	int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
	}
}