/*Write a java program to input any character and check whether it is alphabet, digit or special character.*/
import java.util.*;
public class AlphaDigit{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Char");
	char ch=sc.next().charAt(0);
	
	String result=(ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')?ch+"is alphabetic":
	               (ch>='0'&& ch<='9')? ch+"is digit":
				   ch+"is special char";
				   
			System.out.println(result);

  }
}