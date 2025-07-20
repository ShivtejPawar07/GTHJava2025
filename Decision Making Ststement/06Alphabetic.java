/*Q6. Write a Java program to check whether a character is alphabetic or not.*/
import java.util.*;
class Alphabetic{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the char");
	  char ch=sc.nextLine().charAt(0);
	  
	   
	  if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
	  System.out.println("Character is Alphabetic");
	  }
	  else {
	   System.out.println("Character is not Alphabetic");
	  }
   
   }
}
