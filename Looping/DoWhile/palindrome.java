import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int temp=n;//121
		int rev=0,rem;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		if(rev==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}