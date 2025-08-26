
import java.util.*;
class Anagram{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
			int a[]=new int[5];
			int b[]=new int[5];
			
			System.out.println("Enter 1st Array Element");
			for(int i=0;i<a.length;i++){
				a[i]=sc.nextInt();
			}
			System.out.println("Enter 2nd Array Element");
			for(int i=0;i<b.length;i++){
				b[i]=sc.nextInt();
			}
			System.out.println("Display 1st Array Element");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println("\nDisplay 2nd Array Element");
			for(int i=0;i<b.length;i++){
				System.out.print(b[i]+" ");
			}
			Arrays.sort(a);
			Arrays.sort(b);
			boolean flag=true;
			for(int i=0;i<a.length;i++){
				if(a[i]!=b[i]){
					flag=false;
				}
			}
			if(flag)
				System.out.println("\nAnagram");
			else
				System.out.println("\nNot Anagram");
			
	}
}