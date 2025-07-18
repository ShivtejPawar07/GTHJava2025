/* Write a java program to check whether number is neon or not.

Input : 9

Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/

import java.util.*;
public class NeonApp  {
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();//9
	
	int sq=n*n;//81
		
	  int sum=(sq%10)+(sq/10);//=1+8=9
	
	String str=n==sum?"Number is neon":"Number is not neon";
	System.out.println(str);
  }
}