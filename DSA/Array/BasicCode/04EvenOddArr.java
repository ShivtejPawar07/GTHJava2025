/*Q4. Write a java program to find even and odd number in array.
*/
import java.util.*;
class EOApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Elemnt In array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Even Number");
		for(int i=0;i<n;i++){
			if(a[i]%2==0)
			System.out.print(a[i]+" ");
		}
		System.out.println("\nOdd Number");
		for(int i=0;i<n;i++){
			if(a[i]%2!=0)
			System.out.print(a[i]+" ");
			
		}
	}
}