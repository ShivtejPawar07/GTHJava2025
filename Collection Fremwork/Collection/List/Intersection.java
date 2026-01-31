/*Intersection*/
import java.util.*;
class Intersection{
	static void intersection(int[]a,int[]b){
		HashSet<Integer> hs=new HashSet<>();
		for(int val:a){
			hs.add(val);
		}
		System.out.print("Intersection Element=");
		for(int val:b){
			if(hs.contains(val)){
				System.out.print(val+" ");
				hs.remove(val);// avoid duplicate printing
			}
		}
	
	}
	public static void main(String[]x){
		int[]a={1,2,1,8,3,2,5,4,8};
		int[]b={2,4,2,8,10,4,2};
		intersection(a,b);
	}
}
