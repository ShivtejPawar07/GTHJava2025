/*Q1. Write a java program to check Number Is Armstrong Number or Not Armstrong using 
function recursion.*/
import java.util.*;
class RecArmApp{
	static int countDigit(int n){
		if(n==0)
			return 0;
		return 1+countDigit(n/10);
	}
	static int sumOfPower(int n,int cnt){
		if(n==0)
			return 0;
		
		int rem=n%10;
		
		return (int)Math.pow(rem,cnt)+sumOfPower(n/10,cnt);
		
	}
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		int n=sc.nextInt();
		
		int cnt=countDigit(n);
		System.out.println(cnt);
		int sum=sumOfPower(n,cnt);
		System.out.println(sum);
		if(n==sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
	
}