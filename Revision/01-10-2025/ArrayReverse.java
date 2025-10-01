/*15. Write program to create array of size 5 and reverse it*/
import java.util.*;
class ArrayReverse{
	public static int[] reverse(int[] a,int n) {
		for(int i=0,j=n-1;i<j;i++,j--){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		return a;
		
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num in array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("ENter an Array Element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Display an array elemnt");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		  a=ArrayReverse.reverse(a,n);
		  System.out.println("REv an array elemnt");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}