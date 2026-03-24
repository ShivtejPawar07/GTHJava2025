import java.util.*;
class UIApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number in an 1st array");
		int n1=sc.nextInt();
		int[] a=new int[n1];
		System.out.println("Enter 1st array Elemnt");
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Dispaly 1st array Elemnt");
		for(int i=0;i<n1;i++)
			System.out.print(a[i]+" ");
		
		System.out.println("\nHow many number in an 2nd array");
		int n2=sc.nextInt();
		int[] b=new int[n2];
		System.out.println("Enter 2nd array Elemnt");
		for(int i=0;i<n2;i++)
			b[i]=sc.nextInt();
		
		System.out.println("Display 2nd array Elemnt");
		for(int i=0;i<n2;i++)
			System.out.print(b[i]+" ");
	
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println("\nUnion of Array");
		int i=0,j=0;
		while(i<n1 && j<n2){
			if(a[i]<b[j]){
				System.out.print(a[i]+" ");
				i++;
			}
			else if(b[j]<a[i]){
				System.out.print(b[j]+" ");
				j++;
			}
			else{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}	
		}
		while(i<n1){
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<n2){
			System.out.print(b[j]+" ");
			j++;
		}
		System.out.println("\nIntersection");
		i=0;
		j=0;
		while(i<n1 && j<n2){
			if(a[i]<b[j]){
				i++;
			}
			else if(a[i]>b[j]){
				j++;
			}
			else{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
		}
	}
	
}