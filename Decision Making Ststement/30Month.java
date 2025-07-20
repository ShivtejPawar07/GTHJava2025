/*Q30. Write a java program to enter month number between(1-12) and 
print number of days in month using if else. How to print the number of 
days in a given month using if else in java programming.*/
import java.util.*;
class Month{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter a month number");
	int n=sc.nextInt();
	if(0<n && n<=12){
		
	if(n==1 || n==3||n==5||n==7||n==8||n==10||n==12){
	  System.out.println("Number of days: 31");
	}
	else if(n==4||n==6||n==9||n==11){
		System.out.println("Number of days: 30");
	}
	else if(n==2){
		System.out.println("Number of days: 28 (29 in leap year)");
	}
	}else{
		System.out.println("Invalid input");
	}
  }
}