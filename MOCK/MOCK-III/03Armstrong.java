/*Q3. Write a java program to check number Is armstrong number or not armstrong using 
function. */
import java.util.*;
class Arm{
	static boolean isArm(int n){
		int temp=n;
		int cnt=0;
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		temp=n;
		while(temp!=0){
			int rem=n%10;
				
		}
	}
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		int n=sc.nextInt();
		
		if(isArm())
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}