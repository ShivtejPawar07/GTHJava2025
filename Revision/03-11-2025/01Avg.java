/*1. Average of Elements
Concept: First compute the sum, then divide by the number of elements.
 arr = [10, 20, 30, 40, 50]
Average of array elements: 30.0
*/
class Avg{
	public static void main(String x[]){
		int[] a={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println("Avg="+(double)(sum/a.length));
	}
}