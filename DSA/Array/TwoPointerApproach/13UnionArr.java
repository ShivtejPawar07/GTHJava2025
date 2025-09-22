/*13.Find the union of two sorted arrays using two pointers.
*/
import java.util.*;
class Union
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

	     Arrays.sort(a);//1 2 3 4 5
		 Arrays.sort(b);//3 4 5 6 7
                                           
		System.out.println("\nUnion of Array");
		int i=0,j=0;
		while(i<n1 && j<n2){
			if(a[i]<b[j]){
				System.out.print(a[i]+" ");
				i++;
			}
			else if(b[j]<a[i]){
				System.out.print(b[j]+" ");
				j++;
			}
			else{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}	
		}
		while(i<n1){
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<n2){
			System.out.print(b[j]+" ");
			j++;
		}	
	}
}