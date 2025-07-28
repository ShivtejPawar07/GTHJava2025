/*Q50. Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
 A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
 Example: 145 → 1! + 4! + 5! = 145.
Explanation:
 Use loops:
Outer loop for numbers from 1 to n.
Inner loop to extract digits and compute each digit’s factorial with another nested loop.
Sum and compare with the original number.
*/
import java.util.*;
class Krishnamurthy{
  public  static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a limit");
  int limit=sc.nextInt();
  int n=1;
  while(n<=limit){
  int temp=n;
  int sum=0;
  while(n!=0){
   int rem=n%10;
   int i=1,fact=1;
   while(i<=rem){
     fact*=i;
	 i++;
   }
   sum+=fact;
   n/=10;
  }
  n=temp;
  if(n==sum)
  System.out.println(n);
  n++;
  }
  }
}