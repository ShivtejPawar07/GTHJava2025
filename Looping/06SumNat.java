/*6.Write a C program to find the sum of all natural numbers between 1 to n.
*/
import java.util.*;
class SumNat{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num");
	 int n=sc.nextInt();
	 int i=1,sum=0;
	 while(n>=i){
	 sum+=i;
	  
	  i++;
	 }
	 System.out.println("sum of all natural numbers:"+sum);
  }
}