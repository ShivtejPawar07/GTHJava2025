/*4. Product of Array Except Self
Description:
Return a list output where each element is the product of all other elements. No division allowed.
Example:
Input: [1,2,3,4]
Output: [24,12,8,6]
*/
import java.util.*;
class Product{
	public static void main(String[]x){
		ArrayList<Integer>al=new ArrayList<>();
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
			
		System.out.println("ArrayList"+al);
		
		ArrayList<Integer>al2=new ArrayList<>();
			for(int i=0;i<al.size();i++){
				int pro=1;
				for(int j=0;j<al.size();j++){
					if(i!=j){
						pro*=al.get(j);
					}
				}
				al2.add(pro);
			}
			
			System.out.println("Product="+al2);
	}
	
}