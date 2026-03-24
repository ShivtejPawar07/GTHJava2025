/*Create a Java main class named ArrayOps that demonstrates function overloading using 
arrays. You must write three overloaded methods named process() with different parameter 
lists. 
Requirements: 
1. process(int[] arr) 
• Accepts a 1D integer array 
• Returns the sum of all elements in the array 
 
            2. process(int[] arr, int key) 
• Accepts a 1D integer array and a key value 
• Returns the count of occurrences of the given key in the array 
Example: 
If arr = {2, 3, 2, 5, 2} and key = 2 → output = 3 
 
          3. process(int[] arr, int start, int end) 
• Accepts a 1D integer array and two index values 
• Returns the sum of elements from start index to end index (inclusive) 
Example: 
arr = {5, 10, 15, 20, 25}, start = 1, end = 3 
Range sum = 10 + 15 + 20 = 45*/

class ArrayOps{
	int process(int[]a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
	int process(int[]a,int key){
		int cnt=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==key){
				cnt++;
			}
		}
		return cnt;
	}
	int process(int[]a,int start,int end){
		int rsum=0;
		for(int i=start;i<=end;i++){
			rsum+=a[i];
		}
		return rsum;
	}
	
	public static void main(String x[]){
		int[]a={5, 10, 15, 20, 20};
		ArrayOps ao=new  ArrayOps();

			System.out.println("Sum="+ao.process(a));
			System.out.println("Range Sum="+ao.process(a,1,3));
			System.out.println("count of occurrences="+ao.process(a,20));
			
		
	}
}