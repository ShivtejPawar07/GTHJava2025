/*Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/
import java.util.*;
class MissValue{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Number in an array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter a array Elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display a array Elements");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Ascending order");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Missing Elements");
		for(int i=0;i<n-1;i++){
			for(int j=a[i]+1;j<a[i+1];j++){
				System.out.print(j+" ");
			}
		}
		
			
	}
}