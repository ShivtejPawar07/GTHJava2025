/* Write a java program to print 1 to nth Strong number. */
import java.util.*;
class SApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		int n=1;
		//145=1!+4!+5!
		while(n<=limit){
			int sum=0;
			int temp=n;
			while(temp!=0){
				int fact=1;
				int rem=temp%10;
				for(int i=1;i<=rem;i++){
					fact=fact*i;
				}
				sum+=fact;
				temp/=10;
			}
			if(sum==n)
				System.out.print(n+" ");
			n++;
		}
	}
}