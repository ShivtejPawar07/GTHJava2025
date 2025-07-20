/*Q37. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.
*/
import java.util.*;
class GSEApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter two no. :");
		a = sc.nextInt();
		b= sc.nextInt();
		
		if(a>b)
		{
			System.out.println("greater.");
		}
		else if(a==b)
		{
			System.out.println("equal.");
		}
		else{
			System.out.println("smaller.");
		}
	}
}
