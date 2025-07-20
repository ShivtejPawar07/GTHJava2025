/*Q22. Write a java program to check whether a number is palindrome or not.*/
import java.util.*;
class Palindrome{
  public static void main(String x[]){
	  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the three digit number");
	int n=sc.nextInt();//121
	
	int rev=(n%10)*100+((n/10)%10)*10+(n/100);
	
	if(rev==n){
	 System.out.println(n +"is palindrome");
	}else{
	 System.out.println(n +"is not palindrome");
	}
  }
}