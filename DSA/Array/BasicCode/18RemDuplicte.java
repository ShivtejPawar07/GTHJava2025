/*Q18. Write a java program to remove duplicates values of array.*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];//1 1  2 3 4 5
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				  if((a[i]!=a[j]))
				  { flag=true;
					System.out.print(a[i]+" ");
				    break;
				  }
			}
		}
	}
}