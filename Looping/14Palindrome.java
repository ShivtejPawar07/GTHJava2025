/*Q14. Write a java program to check whether a number is palindrome or not.
*/
import java.util.*;
class Palindrome{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	int temp=n;
	int rem,rev=0;
	while(n!=0){
	rem=n%10;//123%10
    rev=(rev*10)+rem;
	n/=10;
	}
	System.out.println(temp);
	String msg=temp==rev?"Palindrome":"Not Palindrome";
	 System.out.println(msg);
  }
}