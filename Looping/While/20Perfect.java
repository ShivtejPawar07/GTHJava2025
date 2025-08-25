/*Q20. Write a java program to find perfect number of a array.*/
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
			for(int j=1;j<=a.length/2;j++)
				if(a[i]%j==0){
					sum=sum+j;
				}
		    }
		}
		if(a[i]==sum){
			System.out.print(a[i]+" ");
			
		
	}
}