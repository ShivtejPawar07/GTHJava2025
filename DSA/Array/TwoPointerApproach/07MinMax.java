/*7.Find the maximum and minimum elements in an array using two pointers.*/
import  java.util.*;
class Sum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Element In array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		/*Arrays.sort(a);
			System.out.println("Maximum="+a[n-1]);
			System.out.println("Minimum="+a[0]);*/
		int max=a[0],min=a[0];
	    for(int i=0;i<n;i++){
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];	
		}
		System.out.println("Maximum="+max);
			System.out.println("Minimum="+min);
	}
}	