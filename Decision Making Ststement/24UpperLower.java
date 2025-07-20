/*Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.*/
import java.util.*;
class UpperLower{
  public static void main(String x[]){
	  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character");
	char ch=sc.nextLine().charAt(0);
	    
	if(ch>='A' && ch<='Z'){
	  System.out.println("It is UpperCase");
	}else if(ch>='a' && ch<='z'){
	System.out.println("It is LowerCase");
	}else{
		System.out.println("Invalid input");
	}
  }
}