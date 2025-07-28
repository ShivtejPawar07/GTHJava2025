/*Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
*/
import java.util.*;
class Neon{
 public static void main(String x[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=sc.nextInt();
   int sq=n*n;//9*9
   int sum=0;
   while(sq!=0){
    int rem=sq%10;//81%10=
	sum+=rem;//0+1
	sq/=10;//81/10=8
   }
   String msg= sum==n?"Neon Number":"Not Neon Number";
   System.out.println(msg);
    }
}