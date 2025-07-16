import java.util.*;
public class Demo{
 public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the three sides of triangle");
	char ch=sc.next().charAt(0);
	
	
	
	String result=(ch>='A' && ch<='Z') || (ch>='a' && ch<='z')?"It is alphabetic":
	              (ch>='0' && ch<='9')?"Number":
                      "It is symbol";				  
					 
					 System.out.println(result);
 }

}