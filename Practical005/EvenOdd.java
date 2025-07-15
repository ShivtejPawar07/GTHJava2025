/* Write a Java program to check whether a number is even or odd.*/
import java.util.*;
public class EvenOdd{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the num");
  int n=sc.nextInt();
  
  String str=(n%2==0)?"Number is even":"Number is odd";
  System.out.println(str);
 
 }
}