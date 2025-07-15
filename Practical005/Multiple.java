 /* Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.

Input: 15

Output: Multiple of both 3 and 5 */

import java.util.*;
public class Multiple{
  public static void main(String []x){
	Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        int n = sc.nextInt();

       // System.out.println("Multiple of both 3 and 5: "+((n/3)&&(n/5)));
		
		String str=((n%3==0)&&(n%5==0))?"Multiple of both 3 and 5":"Not Multiple of both 3 and 5";
		 System.out.println(str);
		
	
	
  }
}