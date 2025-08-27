/*18Sort Colors (Dutch National Flag Problem)
Sort an array of 0s, 1s, and 2s using two/three pointers.*/
import java.util.*;
 class SortColors
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		
		System.out.println("enter array elements:");
		
		for(int i=0;i<a.length;i++)
		{
			int val=sc.nextInt();
			if(val>=0 && val<=2)
			    a[i]=val;
			else
			{
			System.out.println("Invalid:Please enter element again");
			i--;
			}
		}	

      
		int l=0,m=0,h=n-1;
		while(m<=h)
		{
		 if(a[m]==0)
		    {
			   int temp=a[l];
			   a[l]=a[m];
			   a[m]=temp;
			   l++;
			   m++;
            } 
        else if(a[m]==2)
		    {
			 int temp=a[h];
			   a[h]=a[m];
			   a[m]=temp;
			   h--;
			} 
	    else if(a[m]==1)
           m++;		  		
		}
		
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		
	}
}
