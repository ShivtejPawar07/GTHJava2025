/*Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
*/
import java.util.*;
class Factor{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	int i,rem,f,sum=0;
	int temp=n;
	while(n!=0){
	rem=n%10;
	i=1;
	f=1;
	while(i<=rem){
	 f=f*i;
	 i++;
	}
	sum+=f;
	n=n/10;
	}
	String msg= temp==sum?"Strong Number":"Not Strong Number";
	System.out.println(msg);
	
  }
}