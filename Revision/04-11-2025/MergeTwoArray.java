/*Q5. Write program to create class name as MergeTwoArray with parameterized constructor
      MergeTwoArray(int [],int []): this constructor accept two array as parameter
      int [] getMergeArray(): this function merge two array in third array and return new merged    array
*/
import java.util.*;
class MergeTwoArray{
	int []a;
	int []b;
	MergeTwoArray(int []a,int []b){
		this.a=a;
		this.b=b;
	}
	int [] getMergeArray(){
		Arrays.sort(a);
		Arrays.sort(b);
		
		int[]c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
			if(a[i]<=b[j]){
				c[k]=a[i];
				k++;
				i++;
			}
			else{
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length){
			c[k]=a[i];
				k++;
				i++;
		}
		while(j<b.length){
			c[k]=b[j];
				k++;
				j++;
		}
		return c;
	}
	public static void main(String x[]){
		int[] a={1,2,3,4,5};
		int[] b={6,7,8,9};
		
		MergeTwoArray m=new MergeTwoArray(a,b);
		int[]c=m.getMergeArray();
		
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		
	}
}