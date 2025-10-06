/*6. Maximum Sum Subarray of Size K

Approach: Sliding Window
Example: arr = [1,4,2,10,2,3,1,0,20], k = 4 → 24
*/
class MaxSum{
	public static void main(String x[]){
		int[] a={1,4,2,10,2,3,1,0,20};
		int k=4,sum=0,max=Integer.MIN_VALUE;
		for(int i=0;i<k;i++){
			sum+=a[i];
		}
		max=sum;
		for(int i=k;i<a.length;i++){
			sum+=a[i]-a[i-k];
			if(sum>max)
			max=sum;
		}
		System.out.println("Max Sum of size"+k+"is"+max);
	}
}