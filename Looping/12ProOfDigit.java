/*Q12. Write a java program to calculate the product of digits of a number.*/
import java.util.*;
class ProOfDigit{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	int rem,pro=1;
	while(n!=0){
	rem=n%10;
	pro*=rem;
	n/=10;
	}
	 System.out.println("Product of digits of a number:"+pro);
  }
}