/*Q2. WAP to create create matrix of 3 x 3 and sort the column data  and display it
*/
import java.util.*;
public class MADD
{   public static void main(String x[])
	{  int a[][]=new int[3][3];
	     Scanner xyz = new Scanner(System.in);
	   System.out.println("Enter values in first matrix ");
	   for(int i=0; i<a.length; i++)
	   {   for(int j=0; j<a[i].length; j++)
		   {   a[i][j]=xyz.nextInt();
		   }
	   }
		System.out.println("\nDisplay matrix");
		for(int i=0; i<a.length; i++)
		{
	       for(int j=0; j<a[i].length; j++)
		   {
		       System.out.printf("%d\t",a[i][j]);
		   }
		   System.out.printf("\n");
		}
		for(int i=0; i<a.length; i++)
		{     int cols[]=new int[3];   
	       for(int j=0; j<a[i].length;j++)
		   {      
		          cols[j]=a[j][i];
		   }
		   Arrays.sort(cols);
		   for(int k=0;k<a[i].length; k++)
		   {  a[k][i]=cols[k];
		   }
	    }
		System.out.println("\nDisplay matrix");
		for(int i=0; i<a.length; i++)
		{
	       for(int j=0; j<a[i].length; j++)
		   {
		       System.out.printf("%d\t",a[i][j]);
		   }
		   System.out.printf("\n");
	   }
	}
}

