import java.util.*;
class AAPP{
  public static void main(String x[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Number");
   int n=sc.nextInt();
   int temp,cnt=0;
   temp=n;
   while(temp!=0){
     n/=10;
	 cnt++;
   }
   n=temp;
   while(n!=0){
    rem=n%10;
	n=n/10;
	int p=1,j=1;
	while(j<=cnt){
	p=p*rem;
	j++;
	
	}
	sum=sum+p;
   }
   String msg= sum==n?"Armstrong":"Not";
   System.out.println(msg);
  }
}