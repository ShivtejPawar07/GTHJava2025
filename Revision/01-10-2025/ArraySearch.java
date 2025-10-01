/*13. Write program to create array of size 5 and input search key value and search value in array
and if value found return its index and return -1
*/
import java.util.*;
class ArraySearch{
	public static void findElement(int[] a,int n) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a search elemnt");
		int skey=sc.nextInt();
		int index=-1;
		for(int i=0;i<n;i++){
			if(skey==a[i]){
				index=i;
				break;
			}
		}
		if(index==-1){
			System.out.println("Not Found");
		}
		else{
			System.out.println("Found");
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
		 ArraySearch.findElement(a,n);
	}
}