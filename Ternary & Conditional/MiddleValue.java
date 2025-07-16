/* Print the middle value among 3 distinct integers.*/
import java.util.*;
public class MiddleValue{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the three digit  values");
	 int n1=sc.nextInt();//123
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	
	String  middle=(n1>n2 && n1<n3 || n1>n3 && n1<n2)?"Middle:"+n1:
	               (n2>n1 && n2<n3 || n2>n3 && n2<n1)?"Middle:"+n2:
				   "Middle:"+n2;
	 System.out.println(middle);
	 
  
  }
}