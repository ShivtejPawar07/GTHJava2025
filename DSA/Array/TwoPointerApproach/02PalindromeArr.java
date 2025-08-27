/*2.Check if an array is palindrome using two pointers.*/
import java.util.*;
class PaliArr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
		boolean flag=true;
		for(int i=0;i<n/2;i++){//1 2 3 2 1 
			if(a[i]!=a[n-1-i]){//1       1
				flag=false;
			}
		}
		if(flag)
			System.out.println("Array is Palindrome");
		else
			System.out.println("Array is not palindrome");
	}
}