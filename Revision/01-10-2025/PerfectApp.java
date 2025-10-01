/*5. Write a program to input numbers and check if the number is perfect or not?
*/
import java.util.*;
class PerfectApp{
	public static void isPerfect(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		System.out.println(sum==n?n+" is Perfect num":"Not");
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		PerfectApp.isPerfect(n);
	}
}
