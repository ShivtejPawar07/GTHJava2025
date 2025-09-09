/*Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row
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
	   System.out.println("\nTranspose matrix");
	   for(int i=0; i<a.length; i++)
	   {
	       for(int j=0; j<a[i].length; j++)
		   {
		       System.out.printf("%d\t",a[j][i]);
		   }
		   System.out.printf("\n");
	   }
	}
}