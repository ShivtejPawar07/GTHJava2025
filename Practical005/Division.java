/*Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.

Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
*/
import java.util.*;
public class Division{
  public static void main(String []x){
	Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend: ");
        int div = sc.nextInt();

        System.out.println("Enter the divisor: ");
        int dis = sc.nextInt();

       System.out.println("Quotient: "+div/dis);
		System.out.println("Remainder: "+div%dis);
		
	
	
  }
}