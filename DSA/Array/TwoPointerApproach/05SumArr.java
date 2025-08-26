/*5.Find the pair of elements in a sorted array whose sum is equal 
to a given number.*/
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
		Arrays.sort(a);
		System.out.println("Enter Target");
		int t=sc.nextInt();
		for(int i=0,j=n-1;i<j;){
			if(a[i]+a[j]==t){
				System.out.println("("+a[i]+","+a[j]+")");
				i++;
				j--;
			}
			else{
				j--;
			}
		}
	}
}	