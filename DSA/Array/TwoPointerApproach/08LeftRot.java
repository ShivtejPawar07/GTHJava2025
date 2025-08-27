/*8.Rotate an array to the left using two pointers.*/
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
			int temp=a[0];
			for(int i=0;i<a.length-1;i++){
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		k--;
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}