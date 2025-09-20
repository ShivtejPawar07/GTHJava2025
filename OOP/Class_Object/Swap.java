/*15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/
import java.util.*;
class Swap{
	void swapper(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.printf("\nAfter Swaping\n a=%d\tb=%d",a,b);
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("Before Swaping\n a=%d\tb=%d",a,b);
		
		Swap s=new Swap();
		s.swapper(a,b);	
	}
}