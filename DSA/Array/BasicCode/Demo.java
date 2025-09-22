import java.util.*;
class DApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elemnt in an array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array Elemnt");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Display array Elemnt");	
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
			
		for(int i=0;i<n;i++){
			boolean flag=false;
			for(int j=0;j<i;j++){
				if(a[i]==a[j]){
					flag=true;
					break;
				}
			}
			if(!false)
			System.out.println(a[i]+" ");
		}
		
		
	}
	
}