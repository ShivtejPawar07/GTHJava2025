/*1.Reverse an array using two pointers.*/
import java.util.*;
class RevArr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
		for(int i=0,j=a.length-1;i<j;i++,j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
		System.out.println("Reverse Array");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
	}
}