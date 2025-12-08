/*Q4. Take a Vector and add 8 integers.
 Accept a number from the user and check if it exists in the Vector.
Searching using loop
Logical condition:
 if (vector.get(i) == searchValue)


Explanation
Compare each element with the search number.
 If matched, set a boolean flag to true.
*/

import java.util.*;
class SearchApp{
	public static void main(String[]x){
		
		Vector<Integer>v=new Vector<>();
		
		System.out.println("Enter a 10 Num");
		for(int i=0;i<4;i++){
			v.add(new Scanner(System.in).nextInt());
		}
		System.out.println("Enter a skey");
		int skey=new Scanner(System.in).nextInt();
		
		boolean flag=false;
		for(int i=0;i<4;i++){
			if(v.get(i)==skey){
				flag=true;
			}
		}
		if(!flag)
			System.out.println("Not found");
		else
			System.out.println("found");
	}
}