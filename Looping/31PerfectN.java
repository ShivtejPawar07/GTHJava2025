/*Q31. Write a java program to display 1 to nth Perfect Number.
*/
import java.util.*;
class PerfectN{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a limit");
	int num=sc.nextInt();
	int n=2;
	while(n<=num){
	int i=1,sum=0;
	while(i<=n/2){
	 if(n%i==0){
	   sum+=i;
	 }
	 i++;
	}
	         if (sum == n) 
                System.out.println(n);
	          n++;
	}
	
  }
}