/*Q8Find Max Average of Subarray of Size K
Find the maximum average of any subarray of size k.*/
import java.util.*;
class AvgArr{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		int k=2;
		for(int i=0;i<k;i++){
			sum=sum+a[i];
		}
		   System.out.printf("%f\t",(double)sum/k);

		for(int i=k;i<a.length;i++){
			sum=sum+a[i]-a[i-k];
			System.out.printf("%f\t",(double)sum/k);
		}
	}
}