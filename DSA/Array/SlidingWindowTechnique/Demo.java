import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Display array element");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
		
		System.out.println("How many elemnt in the slide");
		int k=sc.nextInt();
		int tsum=3,sum=0;
		
		for(int i=0;i<k;i++)
			sum=sum+a[i];
		
		if(tsum==sum){
			System.out.printf("(a[%d],a[%d])=%d",0,k-1,sum);
		}
		
		for(int i=k;i<n;i++){
			sum+=a[i]-a[i-k];
			if(tsum==sum){
				System.out.printf("(a[%d],a[%d])=%d",i-k+1,i,sum);
			}
		}
	}
}