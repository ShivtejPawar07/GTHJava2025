/*Q5Write a function to check if a number is an Armstrong number.*/
import java.util.*;
class Armstrong{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
	    boolean arm=isArmstrong(n);
		if(arm)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
	public static boolean isArmstrong(int n){
		
		int temp=n,cnt=0;
		for(;temp!=0;){
			temp/=10;
			cnt++;
		}
		 temp=n;
		 int sum=0;
		for(;temp!=0;){
			int rem=temp%10;
			sum+=(int)(Math.pow(rem,cnt));
			temp/=10;
		}
		return sum==n;
	}
}