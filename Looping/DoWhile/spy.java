import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();//1412
		int rem,sum=0,pro=1;
		while(n!=0){
			rem=n%10;
			sum+=rem;
			pro*=rem;
			n/=10;
		}
		if(sum==pro){
			System.out.println("Spy");
		}
		else{
			System.out.println("Not Spy");
		}
			
		
	}
}