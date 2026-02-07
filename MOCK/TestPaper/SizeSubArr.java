/*Q.2 Write a Java program to find the size of the window (subarray) whose sum is equal to a  
given target value using the sliding window technique. 
Example: 
Array = {1, 4, 20, 3, 10, 5} 
Target Sum = 33 
 
Explanation: 
Subarray {20, 3, 10} → Sum = 33 
Output: Window Size = 3*/
class SizeSubArr{
	public static void main(String[]x){
		int[]a={1, 4, 20, 3, 10, 5};
		int tsum=33;
		int i=0;
		int sum=0;
		
		for(int j=0;j<a.length;j++){
			sum+=a[j];
			while(sum>tsum){
				sum-=a[i];
				i++;
			}
			if(tsum==sum){
				System.out.println("Window Size = " + (j-i+1));
                return;
			}
		}
		System.out.println("Not found");
	}
}