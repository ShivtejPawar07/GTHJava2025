/*Q5. Write a java program to find positive and negative number in array.
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
		System.out.println("Positive Number");
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("Negative Number");
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("Zero");
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				System.out.println(a[i]+" ");
			}
		}
		
	}
}