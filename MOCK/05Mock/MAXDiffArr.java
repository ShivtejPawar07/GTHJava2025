/* Q1. Write a program in java to find out the maximum difference between any two elements such that 
larger element appears after the smaller number. 
 Expected Output : 
 The given array is : 7 9 5 6 13 2 
 The elements which provide maximum difference is: 5, 13 
 The Maximum difference between two elements in the array is: 8*/
 
class MaxDiff{
	public static void main(String[]x){
		int[]a={7,9,5,6,13,2};
		int n1=0,n2=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				  int diff = a[j] - a[i];
				if(diff>max){
					max=diff;
					
				n1=a[i];
				n2=a[j];
				}
			}
		}
		System.out.printf("(%d,%d)",n1,n2);
	}
}