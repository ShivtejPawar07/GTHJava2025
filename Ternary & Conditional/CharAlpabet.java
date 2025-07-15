/*Write a Java program to check whether character is alphabetic or not.*/

import java.util.*;
public class CharAlpabet{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Char");
	char ch=sc.next().charAt(0);
	
	String result=(ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')?
	               ch+"is alphabetic":
				   ch+"is not alphabetic";
				   
			System.out.println(result);

  }
}
