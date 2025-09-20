/*8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/
import java.util.*;
class SquareFinder{
	int calSquare(int n){
		return n*n;
	}
}
class Square{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		SquareFinder sq=new SquareFinder();
		
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		System.out.println("Square="+sq.calSquare(n));
	}
}