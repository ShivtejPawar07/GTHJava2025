import java.util.*;
class PApp{
	static public void main(String[] x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();//121
		int temp=n;
		int rev=0;
		while(n!=0){
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(temp==rev?"Palindrome":"Not");
	}
}