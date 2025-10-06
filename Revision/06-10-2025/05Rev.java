/*5. Reverse an Array In-place

Approach: Two Pointers from both ends
Example: arr = [1,2,3,4,5] → [5,4,3,2,1]
*/

class Reverse{
	public static void main(String x[]){
		int[] a={1,2,3,4,5};
		
		for(int i=0,j=a.length-1;i<j;i++,j--){
			int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		}
		
		for(int val :a){
			System.out.print(val+" ");
		}
	}
}