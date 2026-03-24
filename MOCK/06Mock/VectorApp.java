/*Q8. Write a program that maintains a Vector of city names. Perform the following: 
1. Insert 5 cities. 
2. Remove the city at index 3. 
3. Insert a new city at index 1. 
4. Display final list.*/
import java.util.*;
class VectorApp{
	public static void main(String[]x){
		Vector<String> v=new Vector<>();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("DDD");
		v.add("EEE");
		
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		
		v.add(1,"XXX");
		
		System.out.println(v);
		
	}
}