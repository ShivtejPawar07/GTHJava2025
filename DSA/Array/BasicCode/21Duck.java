/*Q21. Write a java program to find duck number of a array.
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
			boolean flag=false;
			for(int j=1;j<=n;j++){
				int rem=n%10;
				if(rem==0){
					flag=true;
				}
				n=n/10;
			}
			if(flag)
				System.out.print(a[i]+" ");
		}
	}
}