/*Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
Explanation:
 Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.
*/
import java.util.*;
class Month{
  public static void main(String x[]){
    int n;
    do{
	
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Month Num(1-12)");
    n=sc.nextInt();
	switch(n){
	case 1:
	 System.out.println("jan");
	 break;
	 
	 case 2:
	 System.out.println("February");
	 System.out.println("enter the year");
	 int y=sc.nextInt();
	 if(y%4==0 && y%100!=0 || y%400==0){
	    System.out.println("It is leap year");
	 }else{
	   System.out.println("It is Not leap year");
	 }
	 break;
	 
	 case 3:
	 System.out.println("March");
	 break;
	 
	 case 4:
	 System.out.println("April");
	 break;
	 
	 case 5:
	 System.out.println("May");
	 break;
	 
	 case 6:
	 System.out.println("June");
	 break;
	 case 7:
	 System.out.println("Jully");
	 break;
	 case 8:
	 System.out.println("August");
	 break;
	 
	 case 9:
	 System.out.println("september");
	 break;
	 
	 case 10:
	 System.out.println("octmber");
	 break;
	 
	 case 11:
	 System.out.println("November");
	 break;
	 
	 case 12:
	 System.out.println("December");
	 break;
	 
	 default:
	 System.out.println("Invalid condition");
	
	}
	
	}while(n!=12);
  }
}