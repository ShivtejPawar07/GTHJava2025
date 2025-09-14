/*3.Merge two sorted arrays into one sorted array using two pointers.*/

import java.util.*;
class MergeSorted
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements in array 1:");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		
		System.out.println("enter array elements of array a:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			
	    System.out.println("Enter how many elements in array 2:");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		
		System.out.println("enter array elements of array b:");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();		

	     Arrays.sort(a);
		 Arrays.sort(b);
		 
		 int c[]=new int[n1+n2];
		 
		 int i=0,j=0,k;
		 for(k=0;k<c.length;k++)
		 {
			 if(i<a.length && a[i]<=b[j])
			 {
				 c[k]=a[i];
				 i++;
			 } 
			 else
			 {
				 c[k]=b[j];
				 j++;
			 } 
		 }
		 
		 System.out.println("Merged array");
		 for(i=0;i<c.length;i++)
		         System.out.println(c[i]+" ");	
    }
}