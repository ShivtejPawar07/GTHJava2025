/*Union*/
import java.util.*;
class UnionApp{
	public static void main(String[]x){
		int[]a={1,2,3,4,5};
		int[]b={4,7,8,9,4,33,2,3,2,3,5,6,7};
		
		Set<Integer>hs=new HashSet<>();
		
		for(int val1:a){
			hs.add(val1);
		}
		for(int val2:b){
			hs.add(val2);
		}
		System.out.println(hs);
		for(int num:hs){
			System.out.print(num+" ");
		}
		
	}
}