/*2.Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
*/
import java.util.*;
class NaturalRev{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num");
	 int n=sc.nextInt();
	 int i=n;
	 while(i>=1){
	  System.out.println(i);
	  i--;
	 }
  }
}