/*Q9. Given an integer array, find the contiguous subarray with the maximum sum. 
Input : [-2,1,-3,4,-1,2,1,-5,4] → Output: 6  (4 + -1 + 2 + 1)*/

class MaxSum{
	public static void main(String[]x){
		int[]a={-2,1,-3,4,-1,2,1,-5,4};
		int k=4,max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<k;i++){
			sum+=a[i];
		}
		max=sum;
		for(int i=k;i<a.length;i++){
			sum+=a[i]-a[i-k];
			if(sum>max)
			max=sum;
		}
		System.out.println("Maximum Sum="+max);
	}
}