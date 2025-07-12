/*Evaluate expressions using compound assignment operators (+=, -=, etc)
*/
import java.util.*;
public class Operator{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a 1st num=");
	int a=sc.nextInt();
	System.out.println("Enter a 2nd num=");
	int b=sc.nextInt();
	
	System.out.println("Addition="+(a+=b));//a=a+b;
	System.out.println("Substraction="+(a-=b));//a=a-b;
	System.out.println("Multiplication="+(a*=b));//a=a*b;
	System.out.println("Division="+(a/=b));//a=a/b;
	System.out.println("Mod="+(a%=b));//a=a%b;
	
  }
}