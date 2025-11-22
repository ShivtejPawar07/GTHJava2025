/*Q7. Write a Java program to implement binary search using function overloading. 
You must create two overloaded methods with the same name binarySearch() that perform 
different operations: 
 
int binarySearch(int[] arr, int key) 
• This method should perform normal binary search on a sorted array. 
• It should return the index of the key if found, otherwise return -1. */
class BinarySearch{
	public static void main(String[]x){
		
		int[]a={2, 4, 4, 4, 6, 7, 9};
		int index=binarySearch(a,10);
		if(index==-1)
			System.out.println("Not element found");
		else
			System.out.println("Element found");
		
		
		
	}
	static int binarySearch(int[] arr, int key){
		int index=-1,l=0,r=arr.length;
		for(int i=0;i<arr.length;i++){
			int mid=l+(r-l)/2;
			if(key==arr[mid]){
				index=mid;
			}
			if(arr[mid]<key){
				l=mid+1;
			}
			else{
				r=mid-1;
			}
		}
		return index;
		
	} 
	
}