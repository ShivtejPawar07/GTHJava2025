/*4.Move all zeroes to the end of the array using two pointers.*/
import java.util.*;
class Zero{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element in an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<n;i++){
			if(a[i]!=0){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.println("Display Array");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}