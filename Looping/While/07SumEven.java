/*7.Write a C program to find the sum of all even numbers between 1 to n.
*/
import java.util.*;
class SumEven{
  public static void main(String x[]){
	  Scanner sc=new Scanner(System.in);
   System.out.println("How many Number");
   int n=sc.nextInt();
   int i=1,sum=0;
   while(n>=i){
     if(i%2==0)
	   sum +=i;
	
	i++;
	
   }
   System.out.println("Sum of Even Number:"+sum);
  }
}