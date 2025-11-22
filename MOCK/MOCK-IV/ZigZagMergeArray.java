/* Write a java program to create a 
Base class: ArrayOperation → contains two arrays 
Child class: ZigZagMerge → merge arrays in zig-zag manner: 
Example: 
A1 = {11,22,33,44} 
A2 = {55,66,77,88} 
Output: 11 55 22 66 33 77 44 88*/
import java.util.*;
abstract class ArrayOperation{
	int[]a;
	int[]b;
	void setArray(int[]a,int[]b){
		this.a=a;
		this.b=b;
	}
	abstract void merge();
	
}
class ZigZagMerge extends ArrayOperation{
	void merge(){
		Arrays.sort(a);
		Arrays.sort(b);
		
		int[]c=new int[a.length+b.length];
		
		int j=0,k=0;
		
		for(int i=0;i<5;i++){
			c[k++]=a[i];
			c[k++]=b[j++];
		}
		System.out.println("\nMerged Array (c):");
        for (int xx : c) {
            System.out.print(xx + " ");
        }
	}
}

public class ZigZagMergeArray{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		int[]a=new int[5];
		int[]b=new int[5];
		System.out.println("Enter 1st array element");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter 2nd array element");
		for(int i=0;i<5;i++)
			b[i]=sc.nextInt();
			
		ZigZagMerge aa=new ZigZagMerge();
		aa.setArray(a,b);
		aa.merge();
	}
}