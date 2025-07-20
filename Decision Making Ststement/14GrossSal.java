/*Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.

                                        Basic Salary <= 10000 : HRA = 20%, DA = 80%

                                        Basic Salary <= 20000 : HRA = 25%, DA = 90%

                                        Basic Salary > 20000 : HRA = 30%, DA = 95% */
										
import java.util.*;
class GrossSal{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the basic salary");
	 double bs=sc.nextInt();
	 
	 if(bs<=10000)
	 {
	 System.out.println("Gross salary:"+(bs+(bs*0.20)+(bs*0.80)));
	 }
	 else if(bs<=20000){
	  System.out.println("Gross salary:"+(bs+(bs*0.25)+(bs*0.90)));
	 }
	 else if(bs>2000){
	 System.out.println("Gross salary:"+(bs+(bs*0.30)+(bs*0.95)));
	 }
	 else{
	 System.out.println("Invalid input");
	 }
  }
}										