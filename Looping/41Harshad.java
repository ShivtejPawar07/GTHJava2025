/*Q41. Write a Java program to check whether a given number is a Harshad number 
(i.e., divisible by the sum of its digits) for numbers from 1 to n.

*/
import java.util.*;
class Harshad{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int limit=sc.nextInt();
	int n=1;
	while(n<=limit){
	int sum=0;
	int temp=n;
	while(temp!=0){
	 int rem=temp%10;
	 sum=sum+rem;
	 temp/=10;
	}
	 // System.out.println(sum);
	if(n%sum==0)
	  System.out.println(n);
   n++;	 
	}
	
  }
}