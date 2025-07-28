/*Q13. Write a java program to enter a number and print its reverse.*/
import java.util.*;
class ProOfDigit{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	int rem,rev=0;
	while(n!=0){
	rem=n%10;//123%10
    rev=(rev*10)+rem;
	n/=10;
	}
	 System.out.println("Reverse of digits of a number:"+rev);
  }
}