/*Q32. Write a java program to display 1 to nth Duck Number.
*/
import java.util.*;
class DuckN{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a limit");
	int num=sc.nextInt();
	int n=1;
	while(n<=num){
	int rem;
	boolean flag=false;
	int temp=n;
	while(n!=0){
	  rem=n%10;
	  if(rem==0)
	  flag=true;
	  n=n/10;
	}
	n=temp;
	if(flag)
	System.out.println(n);
    n++;
	}
  }
}