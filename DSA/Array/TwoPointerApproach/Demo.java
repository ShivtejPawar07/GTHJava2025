import java.util.*;
class Merge{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements in array 1:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter array elements of array a:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Dispaly array elements of array a:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
			
	 //1 2 3 4 5=3 4 5 1 2
		System.out.println("\nHow many elemnt rotate");
		int k=sc.nextInt();
		while(k!=0){
			int temp=a[n-1];
			for(int i=n-1;i>0;i--){
				a[i]=a[i-1];
			}
			a[0]=temp;
			k--;
		}
		System.out.println("Dispaly array elements of array a:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
