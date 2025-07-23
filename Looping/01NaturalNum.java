/*1.Write a C program to print all natural numbers from 1 to n. - using while loop
*/
import java.util.*;
class Natural{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num");
	 int n=sc.nextInt();
	 int i=1;
	 while(n>=i){
	  System.out.println(i);
	  i++;
	 }
  }
}