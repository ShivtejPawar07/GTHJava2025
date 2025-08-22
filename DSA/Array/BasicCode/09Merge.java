/*Q9. Write java program to merge two array and display it.
*/
import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		System.out.println("Enter Array First Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Array Second Elemnt");
		for(int i=0;i<a.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("Display First Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);//1 2 3 4 5
		}
		System.out.println("Display Second Array Elemnt");
		for(int i=0;i<b.length;i++){
			System.out.printf("b[%d]=%d\n",i,b[i]);// 6 7 8 9 10
		}
		
		System.out.println("Merge Elemnt");
		for(int i=0;i<a.length;i++){
				c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
            c[i+a.length]=b[i];   // next 5 elements from b
        }
		for(int i=0;i<c.length;i++){
			System.out.printf("c[%d]=%d\n",i,c[i]);// 6 7 8 9 10
		}	
	}
}