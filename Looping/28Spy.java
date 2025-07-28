/*Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
*/
import java.util.*;
class Spy{
   public static void main(String x[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Number");
   int n=sc.nextInt();
   int sum=0,pro=1,temp;
   
   while(n!=0){
     int rem=n%10;
	 sum +=rem;
	 pro *=rem;
	 n/=10;
   }

   String msg= sum==pro?"Spy Number":"Not Spy Number";
   System.out.println(msg);
   }
}