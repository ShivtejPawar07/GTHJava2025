/*Q1.Write a Java program to convert a primitive int value into an Integer object using wrapper class.
Explanation :- 
Java provides wrapper classes to convert primitive data types into objects. This is called boxing.

Input :- int num = 25
Output :- 25

*/
import java.util.*;
class PW{
	public sttaic void main(String[]x){
		int n=25;
		int a=Integer.parseInt(n);
		System.out.println(a);
	}
}