/*Write a java program to input basic salary of an employee and calculate its Gross salary according to following.

Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.*;
public class GrossSal{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the basic salary of the employee");
	 Double bs=sc.nextDouble();
	 double da,hra;
	
	double result=(bs<=10000)?(bs+0.20*bs+0.80*bs):
	               (bs<=20000)?(bs+0.25*bs+0.90*bs):
				   (bs+0.30*bs+0.95*bs);
	
	 System.out.println("Gross salary:"+result);
  
  }
}