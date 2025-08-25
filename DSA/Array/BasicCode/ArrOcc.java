import java.util.*;
class ArrOcc{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<n;i++){
			System.out.printf(a[i]+" ");
		}
		System.out.println("\nElement" + "\t\t" +"count");
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++){
			if(visited[i]==true){
				continue;
			}
			int cnt=1;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					cnt++;
					visited[j]=true;
				}
			}
			System.out.println(a[i] + "\t\t" + cnt);
		}
		
	}
}
