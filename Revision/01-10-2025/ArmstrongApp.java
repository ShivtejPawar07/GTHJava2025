/*8. Write a program to input numbers and check if the number is Armstrong or not?
*/
import java.util.*;
class ArmstrongApp{
	public static void isArm(int n){
		
		int temp=n,cnt=0;
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		temp=n;
		int sum=0;
		while(temp!=0){
			int rem=temp%10;
			sum=sum+(int)Math.pow(rem,cnt);
			temp/=10;
		}
		System.out.println(sum==n?" idArm":"Not");
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		ArmstrongApp.isArm(n);
	}
}