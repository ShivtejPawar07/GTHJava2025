/* Write a program to calculate sum of first and last digit of a number without using loop.
Input : 123
Output : 4
*/
import java.util.*;
public class SumFl  {
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the three digit num");
	int n=sc.nextInt();
	
	int l=n%10;
	int f=n/100;
	
	System.out.println("Sum of last and first digit="+(l+f));	
  }
}