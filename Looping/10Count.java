/*10.Write a C program to count the number of digits in a number.*/
import java.util.*;
class Count{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=sc.nextInt();
  int count=0;
  while(n>0){
	  n /=10;
   count++;
  
  }
  System.out.println("count the number of digits:"+count);
  }
}