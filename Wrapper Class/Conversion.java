/*Q1.Write a Java program to convert a primitive int value into an Integer object using wrapper class.
Explanation :- 
Java provides wrapper classes to convert primitive data types into objects. This is called boxing.

Input :- int num = 25
Output :- 25

*/
import java.util.*;
class PW{
	public static void main(String[]x){
		int n=25;
		Integer a=n;
		System.out.println(a);
		Integer a = Integer.valueOf(n);
		System.out.println(a);
		
		/*Q2. Write a java program to Convert an Integer object into a primitive int.
Explanation :- 
Extracting primitive value from wrapper object is called unboxing.

Input :- Integer num = 50
Output :- 50
*/

		Integer n2 = 50;   // Wrapper object
        int b = n2;        // Auto Unboxing
        System.out.println(b);
	}
}