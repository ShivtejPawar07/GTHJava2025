/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1, -3,   4,   -1,  2,  1,   -5, ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[9];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int k=4;
		int max=Integer.MIN_VALUE;
			for(int i=0;i<(a.length-k);i++){
				int sum=0;
			 
			   for(int j=i; j<(i+k); j++)
			   {
					sum = sum + a[j];	
			   }
				
			   if(sum>max)
			   { 
				max=sum;
			   }
		   }
		   System.out.printf("Max value is %d\n",max);

	}
}