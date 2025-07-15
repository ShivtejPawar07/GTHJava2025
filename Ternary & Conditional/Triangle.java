/* Write a Java program to check whether a triangle is valid or not.*/
import java.util.*;
public class Triangle{
 public static void main(String x[]){
  Scanner sc=new Scanner(System.in);
  
 System.out.println("enter the 1st angle");
  int a1=sc.nextInt();
   System.out.println("enter the 2nd angle");
  int a2=sc.nextInt();
  System.out.println("enter the 3rd angle");
  int a3=sc.nextInt();
  
  String str=(a1+a2+a3==180)?"It is triangle":"It is not Triangle";
  System.out.println(str);
 }
}