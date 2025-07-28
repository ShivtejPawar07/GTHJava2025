/*Q11. Write a java program to calculate the sum of digits of a number.*/
import java.util.*;
class SumDigit{
  public static void main(String x[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=sc.nextInt();
   int sum=0,rem;
   while(n!=0){
    rem=n%10;
	sum=sum+rem;
	n=n/10;
   }
    System.out.println("sum of digits of a number:"+sum);
  }
}