/*// 8. Longest Subarray with Sum ≤ K
/*
10. Minimum Size Subarray with Sum ≥ Target
Example: arr = [2,3,1,2,4,3], target = 7 → Length: 2 ([4,3])
*/
import java.util.*;
class MaxLen{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number(minimum 2 digit)");
		int n=sc.nextInt();
		int temp=n;//12345
		int cnt=0;
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		temp=n;	
		
		int first2=temp/(int)Math.pow(10,cnt-2);
		int last2=temp%100;
		int middle=(temp%(int)Math.pow(10,cnt-2))/100;
		
		System.out.println(last2*(int)Math.pow(10,cnt-2)+middle*100+first2);
	}
}