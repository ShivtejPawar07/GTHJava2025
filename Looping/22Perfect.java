/*Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of
 its proper divisors. The smallest perfect number is 6,which is the sum 
 of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/
import java.util.*;
class Perfect{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int i=1,sum=0;
	while(i<=n){
	  if(n%i==0){
	   sum +=i;
	  } 
	  i++;
	}
	String msg= n==sum?"Perfect":"Not Perfect";
	System.out.println(msg);
  }
}