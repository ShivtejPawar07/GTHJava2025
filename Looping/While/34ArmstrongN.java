/*Q34. Write a java program to display 1 to nth Armstrong Number.*/
import java.util.*;
class ArmstrongN{
  public static void main(String x[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Number");
   int num=sc.nextInt();
   int n=1;
   while(n<=num){
   int temp=n,cnt=0;
   while(temp!=0){
   temp/=10;
   cnt++;
   }
   temp=n;
   int sum=0;
   while(temp!=0){
   int rem=temp%10;
   sum=sum+((int)Math.pow(rem,cnt));
   temp/=10;
   }
   if(n==sum)
   System.out.println(n);
   n++;
   }
  }
}