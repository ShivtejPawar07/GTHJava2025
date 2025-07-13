/*.Calculate age from year of birth
  
*/
import java.util.*;
public class AgeApp{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Birthyear");
	int bYear=sc.nextInt();//2004
	System.out.println("Enter the Currentyear");
	int cYear=sc.nextInt();//2025

	System.out.println("age:"+(cYear-bYear));
	
	}
}
