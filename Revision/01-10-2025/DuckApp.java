/*6. Write a program to input numbers and check if the number is duck or not?
*/
import java.util.*;
class DuckApp{
	public static void isDuck(int n){
		boolean flag=false;
		while(n!=0){
			int rem=n%10;
			if(rem==0){
				flag=true;
				break;
			}
			n/=10;
		}
		System.out.println(flag==true?" idDuck":"Not");
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		DuckApp.isDuck(n);
	}
}