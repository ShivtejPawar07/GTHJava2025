/*Minimum Sum Subarray of Size K
Find the minimum sum of a subarray with size k.
0 1 2 3 4 5 6
k=3   0 1 2  =3
      1 2 3  =6
	  2 3 4  =9
	  3 4 5  =12
	  4 5 6  =15
	  ans min=3*/
import java.util.*;
class MinSum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]={0,1,2,3,4,5,6};
		
		System.out.println("Enter a k Value");
		int k=sc.nextInt();
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<k;i++){//
			sum+=a[i];
		}
		min=sum;
		for(int i=k;i<a.length;i++){
			sum+=a[i]-a[i-k];//
			if(sum<min)
				min=sum;
		}
		System.out.println("Minimum sum="+min);
		
	}
}








/*import java.util.*;
class MaxSumSubArray{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter elements:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		int k=3;
		int sum=0;
		int min=Integer.MAX_VALUE;;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		
		    if(i>=k)
			{	
				sum=sum-a[i-k];
			}
			if(i>=k-1 && sum<min)
			{ 
				min=sum;
			}
		}	
		System.out.println("Minimum Sum="+min);
	}
}
*/