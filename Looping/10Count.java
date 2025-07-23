/*10.Write a C program to count the number of digits in a number.*/
import java.util.*;
class Count{
  public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=sc.nextInt();
  int count=0;
  while(n>0){
	  n /=10;//123/10=12//12/10=1//1/10
   count++;//1//2//3
  
  }
  System.out.println("count the number of digits:"+count);
  }
}