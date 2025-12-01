/*
Q7. Abstract Method for Merging Two Arrays
Problem:
 Create an abstract class MergeArrays with an abstract method merge(). In a subclass, 
 merge two arrays given via constructor and display the merged result.
Explanation:
 Combines constructor logic with multi-array processing and abstract class concept.
*/
import java.util.*;
abstract class MergeArrays{
	int[]a;
	int[]b;
	MergeArrays(int[]a,int[]b){
		this.a=a;
		this.b=b;
	}
	abstract void merge();
} 
class Merge extends MergeArrays{
	Merge(int[]a,int[]b){
		super(a,b);
	}
	void merge(){
		Arrays.sort(a);
		Arrays.sort(b);
		int[]c=new int[a.length+b.length];
		int i=0,k=0,j=0;
		while(i<a.length && j<b.length){
			if(a[i]<=b[i]){
				c[k++]=a[i++];
			}
			else{
				c[k++]=b[j++];
			}
			
		}
		while(i<a.length){
			c[k++]=a[i++];
		}
		while(j<b.length){
			c[k++]=b[j++];
		}
		Arrays.sort(c);
		for(int val:c){
			System.out.print(val+" ");
		}
	}
}
class MergeApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5};
		int[]b={6,7,8,9,10,11,4,2,8};
		
		Merge m=new Merge(a,b);
		m.merge();
	}
}