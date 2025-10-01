/*14. Write a program to create an array of size 10 and find occurrences of every element in the array?
*/
import java.util.*;
class ArrayOcc{
	public static void findOcc(int[] a,int n){
		boolean[] visited=new boolean[n];
		System.out.println("\nElement\t\tCount");
		for(int i=0;i<n;i++){
			if(visited[i]==true)
				continue;
			int cnt=1;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					cnt++;
					visited[j]=true;
				}
			}
			System.out.println(a[i]+"\t\t"+cnt);
		}
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num in array");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("ENter an Array Element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Display an array elemnt");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		ArrayOcc.findOcc(a,n);
	}
}
