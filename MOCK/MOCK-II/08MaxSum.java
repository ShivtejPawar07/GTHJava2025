/*Q8. Write a Java program to find the maximum sum of any contiguous subarray of size k from a 
given array. 
Concept tested: Fixed-size sliding window for subarray sums. 
  
 Input: arr = [2, 1, 5, 1, 3, 2], k = 3 
 Output: 9 
 Explanation: Subarray [5,1,3] has the maximum sum = 9 */
 import java.util.*;
 class Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in array 1:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements of array a:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Display array elements of array a:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			

		System.out.println("\nEnter a k value");
		int k=sc.nextInt();
		int sum=0;
		int max=Integer.MIN_VALUE;
		//create 1st window
		for(int i=0;i<k;i++){
			sum+=arr[i]; //sum
		}
		max=sum;
		//create another window
		for(int i=k;i<arr.length;i++){
			sum += arr[i]-arr[i-k];//1 st element remove of the window add next elemnt int window
			if(sum>max)
				max = sum; //check sum is max
		}
		System.out.printf("The max Sum is :%d",max);
	}
}

