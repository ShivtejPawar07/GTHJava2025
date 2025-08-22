/*Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
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
		System.out.println("Enter index");
		int index=sc.nextInt();
		for(int i=index;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length-1;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}	
	}
}