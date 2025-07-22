/*Q58. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation:
 Use switch on the level number and print the salary range.
*/
import java.util.*;
class Emp{
  public static void main(String x[]){
	  
  int ch;
   do{
  Scanner sc=new Scanner(System.in);
  System.out.println("1 Junior");
  System.out.println("2 Mid");
  System.out.println("3 Senior");
  System.out.println("4 Exit");
  System.out.println("enter your choice");
	 ch=sc.nextInt();
	
	switch(ch){
	  case 1: System.out.println("Junior (20,000 - 30,000)");
	  break;
	  case 2: System.out.println("Mid (31,000 - 50,000)");
	  break;
	  case 3: System.out.println("Senior (51,000 - 80,000)");
	  break;
	  case 4: System.out.println("Thank you Visit again");
	  break;
	  
	}
	
	}while(ch!=4);
}
}