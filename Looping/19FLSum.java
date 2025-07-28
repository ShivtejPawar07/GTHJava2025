/*Q19. Write a java program to find the sum of the first and last digit of a number.
*/
import java.util.*;
class FLSum{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	int l=n%10;
	System.out.println("last:"+l);
	int rem;
	while(n>10){
	 
	 n=n/10;
	 
	 }
	int f=n;
	 System.out.println("first:"+f);
	  System.out.println("Sum:"+(f+l));
	
	
  }
}