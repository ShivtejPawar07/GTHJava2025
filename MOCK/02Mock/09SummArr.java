/*Q9. Write a Java program to find the maximum of all subarrays of size k. 
 
  Example: 
    Input: arr = [1,3,-1,-3,5,3,6,7], k = 3 
    Output: [3,3,5,5,6,7] 
    Explanation: Each window gives a maximum →  
    [1,3,-1] → 3   
    [3,-1,-3] → 3   
    [-1,-3,5] → 5   
    [-3,5,3] → 5   
    [5,3,6] → 6   
    [3,6,7] → 7 */
import java.util.*;
 class Sum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in array 1:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements of array a:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Display array elements of array a:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\nEnter a k value");
		int k=sc.nextInt();
		int max=Integer.MIN_VALUE;
		//create 1st window
		for(int i=0;i<k;i++){
			if(a[i]>max)
				max=a[i];
		}
		System.out.printf(max+" ");//print max;
		//create another window
		for(int i=k;i<a.length;i++){
			if(a[i]>max)
				max=a[i];//check element is max or not
			System.out.printf(max+" ");
		}
	}
}