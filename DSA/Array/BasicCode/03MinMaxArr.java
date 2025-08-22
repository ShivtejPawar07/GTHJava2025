/*Q3. Write a java program to find maximum and minimum number in array.
*/
import  java.util.*;
class MaxMin{
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
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Maximum No. of Array:"+max);
		System.out.println("Minimum No. of Array:"+min);
	}
}