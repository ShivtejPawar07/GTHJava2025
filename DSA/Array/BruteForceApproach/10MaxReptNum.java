
/*Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7*/
import java.util.*;
class array{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("limit:");
		int n=sc.nextInt();
		System.out.println("enter element rang K:");
		int k=sc.nextInt();
		System.out.println("Now enter elementa in range of K:");
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++){
			while(true){
				int val=sc.nextInt();
					if(val<=k){
						a[i]=val;
						break;
					}
					else{
						System.out.println("invalid:");
					}
			}
		}
		System.out.println("-----------------------------------------");
		for(int i=0;i<a.length;i++){
			  System.out.println(a[i]);
		}
		int max=0,cnt=0,mx=0;
		int i;
		for(i=0;i<a.length;i++){
				cnt=0;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					cnt++;
				}
			}
			if(cnt>mx)
			{	mx=cnt;
				max=a[i];
			}
		}
			System.out.println("The maximum repeating number is:"+max+"count:"+mx);
			
	}
}
