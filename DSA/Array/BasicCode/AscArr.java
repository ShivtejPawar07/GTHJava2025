/*WAP to enter the five element and display in ascending order ?*/
import java.util.*;
class Asc{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Elemnt in Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Elemnt in Array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<n;i++){
			//System.out.printf("a[%d]=%d\n",i,a[i]);
		System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("Ascending order");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		
		
		
		
	}
}
