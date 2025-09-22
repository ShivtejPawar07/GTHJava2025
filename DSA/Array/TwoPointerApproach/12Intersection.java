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
		Arrays.sort(a);//1 2 3 4 5
		Arrays.sort(b);//2 3 4 6 7
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