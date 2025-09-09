/*Q3Check if Subarray with Given Sum Exists
For a given sum, check if there’s a subarray with that sum using sliding window.*/
import java.util.*;
class SumArr
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
       int a[]=new int[5];
	   int k=2,target=3;
	   System.out.println("Enter values in array");
	   for(int i=0; i<a.length; i++)
	   { a[i]=xyz.nextInt();
	   }
	   int sum=0,count=0;
	   for(int i=0; i<k; i++)
	   {
	      sum =sum+a[i];
	   }
	   if(sum==target)
	      System.out.printf("Window [a[0],a[%d]] = %d\n", k-1, sum);
	   for(int i=k; i<a.length; i++)
	   {   sum = sum + a[i]-a[i-k];
		   if(sum==target)
		    System.out.printf("Window [a[%d],a[%d]] = %d\n", i-k+1, i, sum);
	   }
   }
}
