/*5
️) Move Zeroes 
Move all zeros in the array to the end while maintaining the order of non-zero elements. 
Example 
Input: [0,1,0,3,12] 
Output: [1,3,12,0,0] */

class MoveZero{
	public static void main(String[]x){
		int[]a={0,1,0,3,12};
		int i=0;
		int j=0;
		while(i<a.length){
			if(a[i]!=0){
				a[j]=a[i];
				j++;
			}
			i++;
		}
		while(j<a.length){
			a[j]=0;
			j++;
		}
		System.out.println("Display Array");
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
} 