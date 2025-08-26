/*WAP to create array of size 10 and store 10 values in it and find the duplicated 
values from array */

import java.util.*;
public class FD
{    public static void main(String x[])
	 {  int a[]=new int[10];
	    Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
		   a[i]=xyz.nextInt();
		}
	    Arrays.sort(a);
	    System.out.println("Display array after sorting");
        for(int i=0; i<a.length; i++)
        { 
				System.out.printf("%d\t",a[i]);
        } 		
		int count=1;
		//duplicate logics 
		for(int i=1; i<a.length; i++)
		{
			   if(a[i]==a[i-1])
			   {  
					++count;
			   }
			   else{
				   if(count>1)
				   { System.out.printf("\n%d ---->%d",a[i-1],count);
				   }
				   count=1;
			   }
		} 
	}
}
