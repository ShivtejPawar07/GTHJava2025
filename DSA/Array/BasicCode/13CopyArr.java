/*Q13. Write a java program to copy one array to another array.
*/
import java.util.*;
class Copy{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display 1st Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		System.out.println("Display 2nd Array Elemnt");
		for(int i=0;i<b.length;i++){
			System.out.printf("b[%d]=%d\n",i,a[i]);
		}
		
	}
}