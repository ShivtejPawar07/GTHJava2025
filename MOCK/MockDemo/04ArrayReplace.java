/*Q4. Write a java program to replace all elements in the array that are multiples of 5 with t number 5 itself.

Input: [10, 12, 15, 17, 20]

Output: [5, 12, 5, 17, 5]*/

class Arr{
	public static void main(String x[]){
		int[]a={10,12,15,17,20};
			
		for(int i=0;i<a.length;i++){
			if(a[i]%5==0)
				a[i]=5;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}