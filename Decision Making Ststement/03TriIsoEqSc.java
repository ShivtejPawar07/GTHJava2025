
/*Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.
*/
import java.util.*;
class TriValid{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the three sides");
	  int s1=sc.nextInt();
	  int s2=sc.nextInt();
	  int s3=sc.nextInt();
	  
	  boolean isValid=(s1+s2>s3 && s1+s3>s2 && s2+s3>s1);
	  
	  if(isValid){
	    if(s1==s2 && s2==s3 && s1==s3){
		System.out.println("Triangle is Equilateral");
		}
		else if(s1==s2 || s1==s3 || s2==s3){
		System.out.println("Triangle is Isoscale");
		}
		else{
		System.out.println("Scalene");
		}
	  }
	  else{
	  System.out.println("Triangle is not valid");
	  }
   
   }
}