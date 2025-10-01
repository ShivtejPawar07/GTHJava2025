/*12. Write a program to create an array of size and arrange all values in ascending order?
*/
import java.util.*;
class ArrayAscending{
	public static void showAscending(int[] a,int n) {
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("\nAScending an array elemnt");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num in array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("ENter AN Array Element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Display an array elemnt");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		 ArrayAscending.showAscending(a,n);
	}
}