/*Q3. Write program to create class name as FindMax with two functions
       void setArray(int a[]): this function is used for accept array as parameter
       int getMax(): this function can find the max value from array and return it.
*/
import java.util.*;
class FindMax{
	int[]a;
	void setArray(int a[]){
		this.a=a;
	}
	int getMax(){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String xx[]){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter a element");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		FindMax f=new FindMax();
		f.setArray(a);
		System.out.println("MAx="+f.getMax());
		
	}
}