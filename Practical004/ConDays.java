/*.Convert days into years, weeks, and days
*/
import java.util.*;
public class ConDays{
  public static void main(String []x){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the days");
	int totalDays=sc.nextInt();//404
	
	int year=totalDays/365;//404/365=1
	int days=totalDays%365;//404%365=39
	
	int week=days/7;//39/7=5
	int day=days%7;//39%7=4
		
	System.out.println(year+"year "+week+"week "+day+"day");
	
  }
}