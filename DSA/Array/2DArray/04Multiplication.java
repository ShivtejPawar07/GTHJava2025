/*Q4. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its result in 3rd matrix
*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter a 1st Elemnts");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter a 2nd Elemnts");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display 1st Array Elemnts");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Display 2nd Array Elemnts");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<b.length; i++)
	    {
	       for(int j=0; j<b[i].length; j++)
		   {   c[i][j]=0;
		        for(int k=0; k<a[i].length; k++)
				{
					c[i][j]+= a[i][k]*b[k][j];
				}					
		   }
	    }
		System.out.println("Multiplication Array Elemnts");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}