/* Write a Java program to check whether a number is divisible by 5 and 11 or not.*/
import java.util.*;
public class Multiple{
  public static void main(String []x){
	Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num: ");
        int n = sc.nextInt();
		
		String str=((n%5==0)&&(n%11==0))?"Multiple of both 5 and 11":"Not Multiple of both 5 and 11";
	    System.out.println(str);	
  }
}