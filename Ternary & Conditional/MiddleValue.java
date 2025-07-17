/* Print the middle value among 3 distinct integers.*/
import java.util.*;
public class MiddleValue{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the three num values");
	int n1=sc.nextInt();//50
	int n2=sc.nextInt();//25
	int n3=sc.nextInt();//75
	              //  50>25 && 50<75
	String  middle=(n1>n2 && n1<n3 || n1>n3 && n1<n2)?"Middle:"+n1:
	               (n2>n1 && n2<n3 || n2>n3 && n2<n1)?"Middle:"+n2://n1<n2<n3 ||n3<n2<n1
				   (n3>n1 && n2<n3 || n3>n2 && n1<n3)?"Middle:"+n3:
				   "Invalid";
	 System.out.println(middle);
	 
  
  }
}