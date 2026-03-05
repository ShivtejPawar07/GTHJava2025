/* 
Q6. Write a java program to store N integers in a Vector. Replace all even numbers with 0. 
Input: 
6 
2 5 8 7 10 3 
 
Output: 
Modified Vector: 0 5 0 7 0 3
Description: 
Traverse Vector and check modulus condition manually. Replace element using set() method
*/
import java.util.*;
class VEvenApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
	
		System.out.println("Enter a 6 num");
		for(int i=0;i<=5;i++){
			v.add(sc.nextInt());
		}
		System.out.println(v);
		for(int i=0;i<v.size();i++){
			if(v.get(i)%2==0){
				v.set(i,0);
			}
		}
		System.out.println(v);
	}
}