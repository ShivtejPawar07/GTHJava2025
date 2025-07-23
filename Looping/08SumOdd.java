/*8.Write a C program to find the sum of all odd numbers between 1 to n.
*/
import java.util.*;
class SumOdd{
  public static void main(String x[]){
	  Scanner sc=new Scanner(System.in);
   System.out.println("How many Number");
   int n=sc.nextInt();
   int i=1,sum=0;
   while(n>=i){
     if(i%2!=0)
	   sum +=i;
	
	i++;
	
   }
   System.out.println("Sum of Odd Number:"+sum);
  }
}