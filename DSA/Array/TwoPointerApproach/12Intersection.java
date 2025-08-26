import  java.util.*;
class Arr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int []b=new int[5];
		System.out.println("Enter 1st Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array Elemnt");
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("Display 1st Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf(a[i]+" ");
		}
		System.out.println("\nDisplay 2nd Array Elemnt");
		for(int i=0;i<b.length;i++){
			System.out.printf(b[i]+" ");
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("\nInsersections");
		int i=0,j=0;
		for(int k=0;k<(a.length+b.length)-1;k++)
		{ 
			if(a[i]!=b[j])
			{	
		       i++;
			}
			else
			{
				System.out.print(a[i]+" ");
			    j++;
			}			
              				
		}	
	}
}