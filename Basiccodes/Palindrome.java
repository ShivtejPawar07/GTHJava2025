/* Write a java program to check whether number is palindrome or not.
121=121
*/
import java.util.*;
public class Palindrome  {
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the three digit num");
	int n=sc.nextInt();//121
	
	int rev=(n%10)*100+((n/10)%10)*10+(n/100);//121
	
	String str=n==rev?"Number is palindrome":"Number is not palindrome";
	System.out.println(str);
  }
}