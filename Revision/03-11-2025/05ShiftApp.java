/*5.Right Rotate an Array by 1 or K Positions
Concept: Shift elements to the right and bring the last to front.
 Use Case: Buffer manipulation.
Input: arr = [10, 20, 30, 40, 50]
Right rotated array by 2 positions: [40, 50, 10, 20, 30]
*/
import java.util.*;
class ShiftApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		System.out.println("Enter array elemmnt");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			
		System.out.println("how many Shift elements");
			int k=sc.nextInt();
		while(k!=0){
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--){
				a[i]=a[i-1];
				
			}
			a[0]=temp;
			k--;
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}