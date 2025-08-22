/*Avg Of array elemnet*/
import java.util.*;
class Avg{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Array Elemnt");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Array Elemnt");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
		System.out.println("Sum of Array="+sum);
		int cnt=0;
		for(int i=0;i<n;i++){
			cnt++;
		}
		System.out.println("Num of Array="+cnt);
		double avg=sum/cnt;
		System.out.println("Avg of Array="+avg);
		
		
	}
}