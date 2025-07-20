/*Q35. Check whether a given employee is eligible for bonus:
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.*/
import java.util.*;
class Emp{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enetr Years of service and salary.");
	int year=sc.nextInt();//10
	double salary=sc.nextDouble();//1000
	
	if(year>5){
	  System.out.println("Bonus amount"+(salary*0.05));
	}
	else
	 System.out.println("No Bonus");

  }
}

