/*4.Write a C program to print all even numbers between 1 to 100. - using while loop
*/
import java.util.*;
class Even{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
	 int i=1;
	 while(100>=i){
	   if(i%2==0)
	  System.out.println(i);
	  i++;
	 }
  }
}