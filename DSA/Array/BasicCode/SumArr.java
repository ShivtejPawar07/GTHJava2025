/*Sum of array element*/
import java.util.*;
class Sum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Array Elemnt");
		int n=sc.nextInt();
		int []a,b=new int[n];
		
		System.out.println("Array Elemnt");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display 1st Array Elemnt");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Array Elemnt");
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("Display 2nd Array Elemnt");
		for(int i=0;i<n;i++){
			System.out.printf("b[%d]=%d\n",i,b[i]);
		}
        
		
		System.out.println("Display Array Elemnt sum");
		for(int i=0;i<n;i++){
		System.out.print(a[i]+b[i]+" ");
		}
		
	}
}