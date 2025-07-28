/*Q33. Write a java program to display 1 to nth Strong Number.
*/
import java.util.*;
class StrongN{
  public static void main(String x[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Limit");
   int num=sc.nextInt();//100
   int n=1;
   int rem;
  
  
   while(n<=num){//1<=100
    int temp=n,sum=0;
   while(n!=0){//y
    rem=n%10;
	int i=1,f=1;
	while(i<=rem){
	  f=f*i;
	  i++;
	}
	sum=sum+f;
	n=n/10;
	
   }
   n=temp;
   if(n==sum){
   System.out.println(n);
   }
   n++;
   }
  }
}