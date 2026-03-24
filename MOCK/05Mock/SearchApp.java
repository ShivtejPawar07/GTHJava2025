/* Q4. Perform binary search to find the index of a given key in a sorted array. 
 If the key is not found, print -1. 
Example: 
 Input: 
 arr = {2, 4, 6, 8, 10, 12} 
 key = 10 
 Output: Index = 4*/
 
import java.util.*;
class Search{
	static int searchKey(int[]a,int skey){
		int index=-1;
		int l=0,r=a.length-1;
		for(int i=0;i<a.length;i++){
		int mid=l+(r-l)/2;
			if(a[mid]==skey){
				index=mid;
				break;
			}
			if(a[mid]<skey){
				l=mid+1;
			}
			else{
				r=mid-1;
			}
		}
		return index;
	}
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		int[]a={2,4,6,8,10};
		if(searchKey(a,6)!=-1)
			System.out.println("ELlemnt found");
		else
			System.out.println("ELlemnt Not found");
		
	}
}