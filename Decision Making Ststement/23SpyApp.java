/*Q23. Write a java program to Check Number Is Spy Number or Not.

Example :

                 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.

         Input : 1412

        Output : Spy Number

        Explanation :

        sum = (1 + 4 + 1 + 2) = 8

        product = (1 * 4 * 1 * 2) = 8

        since, sum == product == 8 */

import java.util.*;
class SpyApp{
  public static void main(String x[]){
	  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the four digit number");
	int n=sc.nextInt();//1412
	
	int sum=(n%10)+((n/10)%10)+((n/100)%10)+(n/1000);
    int product=(n%10)*((n/10)%10)*((n/100)%10)*(n/1000);
	if(sum==product){
	 System.out.println(n +"is Spy Number");
	}else{
	 System.out.println(n +"is not Spy Number");
	}
  }
}