/*WAP to input a three digit number and reverse it?
*/
import java.util.*;
public class RevApp{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int n=sc.nextInt();//1234
	
	int rev=(n%10)*100+((n/10)%10)*10+(n/100);//3 digit
	int rev4=(n%10)*1000+((n/10)%10)*100+((n/100)%10)*10+(n/1000);//4 digit
    System.out.println("Reverse="+rev4);
  }
}