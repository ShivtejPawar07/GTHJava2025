/*9.Write a C program to print a multiplication table of any number.
*/
import java.util.*;
class Table{
  public static void main(String x[]){
	  Scanner sc=new Scanner(System.in);
   System.out.println("How many Number");
   int n=sc.nextInt();
   int i=1;
   while(i<=10){
    
     System.out.printf("%d * %d = %d\n",n,i,n*i);
	
	i++;
	
   }
   
  }
}