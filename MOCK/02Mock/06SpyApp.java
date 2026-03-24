/*Q6. Write a java program to Check If a Number Is a Spy Number or Not spy number using function 
recursion. */
import java.util.*;
class SpyApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();//input  1412
		boolean result=isSpy(n);//function call
		if(result)
			System.out.println("Spy Number");
		else
			System.out.println("Not Spy Number");
	}	
	public static boolean isSpy(int n){
		//function def
		int sum=0,pro=1;
		while(n!=0){//1412
			int rem=n%10;//2
			sum=sum+rem;//0+2...
			pro=pro*rem;//1*2
			n=n/10;
		}
		return sum==pro;//return o/p
	}		
		
	
}