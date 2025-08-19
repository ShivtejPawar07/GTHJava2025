/*
 WAP to insert value on specified index in array and shift value to next index 
*/
import java.util.*;
class Index{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Element in array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter Element in array");
		for(int i=0;i<n-1;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display before insert values Element in array");
		for(int i=0;i<n-1;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Enter index and value");
		int index=sc.nextInt();
		int value=sc.nextInt();
		for(int i=n-2;i>=index;i--){
			a[i+1]=a[i];
		}
		a[index]=value;
		System.out.println("Display after insert values Element in array");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		
		
		
		
		
	}
	
}