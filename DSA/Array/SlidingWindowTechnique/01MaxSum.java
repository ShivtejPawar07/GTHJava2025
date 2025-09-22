
/*01Maximum Sum Subarray of Size K
Find the maximum sum of a subarray with size k.
0 1 2 3 4 5 6
k=3   0 1 2  =3
      1 2 3  =6
	  2 3 4  =9
	  3 4 5  =12
	  4 5 6  =15
	  ans=15;
*/ 

import java.util.*;
public class SubArraySumMin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6};
		System.out.println("Enter a k value");
		int k = sc.nextInt();
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<k;i++){
			sum += arr[i];
		}
		max = sum;
		
		for(int i=k;i<arr.length;i++){
			sum += arr[i] - arr[i-k];
			if(sum>max)
				max = sum;
		}
		System.out.printf("The max Sum is :%d",max);
	}
}
