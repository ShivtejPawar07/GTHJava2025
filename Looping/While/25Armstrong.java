/*Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
*/
import java.util.*;
class Armstrong{
   public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Number");
	 int n=sc.nextInt();//153
	 int cnt=0;
	 int temp=n;
	 while(temp!=0){
	 temp/=10;
	 
	 cnt++;
	 }//3
	 temp=n;//temp=153
	 int sum=0;
	 while(temp!=0){
	   int rem=temp%10;//153%10=3
	   sum=sum+ ((int)Math.pow(rem,cnt));//0+3*3=9
	   temp/=10;
	 }
	 String msg= n==sum?"Armstrong":"Not";
	 System.out.println(msg);
	 
   }
}