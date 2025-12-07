/*
Q1. Write a Java program to store 5 integers in a Vector.
 Print only the even numbers using a loop.
Vector creation
Adding elements
Logical condition: num % 2 == 0
Explanation
Even numbers are divisible by 2, so we check each number using modulus operator.
*/
import java.util.*;
class EvenApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
		System.out.println("ENter 5 value");
		for(int i=0;i<5;i++){
			v.add(sc.nextInt());	
		}
		System.out.println("Even Number");
		for(int num:v){
			if(num%2==0){
				System.out.println(num);
			}
		}
		
	}
}