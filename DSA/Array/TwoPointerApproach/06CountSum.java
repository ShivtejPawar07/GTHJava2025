/*6.Count the number of pairs in an array with a given sum.*/
import java.util.*;
class CountSum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Element In array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display array element");
		for(int i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
		Arrays.sort(a);
		int cnt=0;
		System.out.println("Enter target value");
		int t=sc.nextInt();
		for(int i=0,j=n-1;i<j;){
			if(a[i]+a[j]==t){
				System.out.println("("+a[i]+","+a[j]+")");
				i++;
				j--;
				cnt++;
			}
			else{
				j--;
			}
		}
		System.out.println("Count Pair="+cnt);
		
	}
}