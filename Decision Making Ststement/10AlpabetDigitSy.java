/*Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.
*/
import java.util.*;
class AlphaDiSy{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the char");
	  char ch=sc.nextLine().charAt(0);
	  
	   
	  if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
	  System.out.println("It is Alphabetic");
	  }
	  else if(ch>='0' && ch<='9') {
	   System.out.println("It is digit");
	  }else{
	   System.out.println("It is specialSymbol");
	  }
   
   }
}
