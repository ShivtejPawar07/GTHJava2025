/* Write a java program to Check Number Is Spy Number or Not.

Example :

A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.

     Input : 1412

     Output : Spy Number


Explanation :

sum = (1 + 4 + 1 + 2) = 8

product = (1 * 4 * 1 * 2) = 8

since, sum == product == 8
*/

import java.util.*;
public class SpyApp  {
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the four digit num");
	int n=sc.nextInt();//1412
	int sum=0,rem,pro=1;
	 // int sum=(n%10)+((n/10)%10)+((n/100)%10)+(n/1000);
	  //	  int product=(n%10)*((n/10)%10)*((n/100)%10)*(n/1000);
	  
	  rem=n%10;//1412%10=2
	  sum=sum+rem;//0+2=2
	  pro=pro*rem;//1*2=2
	  n=n/10;//1412/10=141
	  
	  rem=n%10;//141%10=1
	  sum+=rem;//2+1=3
	  pro*=rem;//2*1=2
	  n/=10;//141/10=12
	  
	   rem=n%10;//14%10=4
	  sum+=rem;//3+4=7
	  pro*=rem;//2*4=8
	  n/=10;//12/10=1
	  
	   rem=n%10;//1
	  sum+=rem;//7+1=8
	  pro*=rem;//8*1=8
	  
	  

	
	String str=pro==sum?"Number is Spy":"Number is not Spy";
	System.out.println(str);
  }
}