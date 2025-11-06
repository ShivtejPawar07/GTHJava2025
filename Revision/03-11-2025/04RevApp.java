/*4.Reverse an Array
Concept: Swap elements from both ends moving toward the center.
 Use Case: Invert order of operations or list of commands.
Example: arr = [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]
*/

import java.util.*;
class RevApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		System.out.println("Enter array elemmnt");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
			
		for(int i=0,j=a.length-1;i<j;i++,j--){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Reverse array elemmnt");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}