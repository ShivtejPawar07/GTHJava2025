/*Q3. Store any 7 integers in a Vector.
 Calculate and print the sum of all elements.
Addition operation
Looping through Vector


Explanation
Keep a variable sum initially 0, then add each element.
*/

import java.util.*;
class SumApp{
	public static void main(String[]x){
		
		Vector<Integer>v=new Vector<>();
		
		System.out.println("Enter a 10 Num");
		for(int i=0;i<10;i++){
			v.add(new Scanner(System.in).nextInt());
		}
		int sum=0;
		for(int num:v){
			sum+=num;
		}
		System.out.println("SUm="+sum);
	}
}