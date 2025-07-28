/*Q18. Write a java program to find the first and last digit of a number.
*/
import java.util.*;
class FL{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	System.out.println("last"+(n%10));
	
	while(n>10){
	 
	 n=n/10;
	 
	 }
	 System.out.println("first"+n);
	
	
  }
}