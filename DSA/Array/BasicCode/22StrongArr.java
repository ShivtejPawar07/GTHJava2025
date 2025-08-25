/*Q22. Write a java program to find strong number of a array.
.*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		
		for(int i=0;i<a.length;i++){
			int n=a[i];
			int rem,f,sum=0;
			while(n>0){
				rem=n%10;
				f=1;
					for(int j=1;j<=rem;j++){
					f=f*j;
					}
				sum+=f;
				n=n/10;
			}
			if(sum==a[i]){
				System.out.print(a[i]+" ");
			}
		}	
	}
}