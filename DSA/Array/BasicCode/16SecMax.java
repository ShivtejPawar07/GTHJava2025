/*Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("ENter Array Element");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
  		int max=a[0];
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max){                                  
				smax=a[i];
			}
		}
		if(smax!=Integer.MIN_VALUE)
			System.out.println("Second Max="+smax);
		else
			System.out.println("There is no Seocnd Max");
		
		
	}
}