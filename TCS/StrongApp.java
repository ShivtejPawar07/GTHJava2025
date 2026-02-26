/*Strong number
1!+4!+5!=145*/
import java.util.*;
class StrongApp{
	static void isStrong(int limit){
		
		for(int n=1;n<=limit;n++){
		int temp=n;
		int sum=0;
		while(temp!=0){
			int rem=temp%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact*=i;
			}
			sum+=fact;
			temp/=10;
		}
		if(sum==n)
			System.out.print(n+" ");
		}
		
	}
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a num");
		int limit=sc.nextInt();
		
		isStrong(limit);
	}

}