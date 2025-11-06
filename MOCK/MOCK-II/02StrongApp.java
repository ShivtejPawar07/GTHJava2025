/*Q2. Write a java program to print 1 to nth Strong number.*/
import java.util.*;
class StrongApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a Limit");
		int limit=sc.nextInt();//limit
		int n=1;
		while(n<=limit){
		int sum=0;
		int temp=n;
		//1! + 4! + 5!=145
			while(temp!=0){//145
				int rem=temp%10;//5
				int f=1;
				//factorial
				for(int i=1;i<=rem;i++){
					f=f*i;
				}//f=120
				sum=sum+f;//0+120
				temp/=10;
			}
			if(sum==n)//check sum==n
				System.out.print(n+" ");
			n++;
		}
	}

}