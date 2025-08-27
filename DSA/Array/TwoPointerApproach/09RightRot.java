/*
09create size of array size of 5 perform right rotaton by 1
0   1  2  3  4
10 20 30 40 50
50 10 20 30 40
*/
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
		System.out.println("How Many Element Rotation");
		int k=sc.nextInt();
		while(k!=0){
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--){//1 2 3 4 5              
					a[i]=a[i-1];
			}
			a[0]=temp;
		k--;
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}