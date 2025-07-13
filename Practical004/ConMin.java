
/*enter min and convert into hrs and min*/
import java.util.*;
public class ConMin{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the min");
	int min=sc.nextInt();
	
	int hrs=min/60;//66/60=1hrs
	int minn=min%60;//66%60=6min
		
	System.out.println(hrs+"hrs "+minn+"min ");
  }
}