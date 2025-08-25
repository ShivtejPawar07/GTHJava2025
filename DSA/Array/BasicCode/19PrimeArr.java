/*Q19. Write a java program to find prime number of a array.*/

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
			boolean flag=true;
			for(int j=2;j<=n/2;j++){
				if(n%j==0){
					flag=false;
				}
			}
			if(flag)
				System.out.print(a[i]+" ");
		}
	}
}