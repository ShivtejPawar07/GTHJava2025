/*Q21. Write a java program to check whether a number is neon or not.              

                Input : 9

                Output : Neon Number

                Explanation: square is 9*9 = 81 and

                The sum of the digits of the square is 9.  */
import java.util.*;
class NeonApp{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the Number");
	int n=sc.nextInt();
	
	int sq=n*n;//81
	int sum=(sq%10)+(sq/10);
	
	if(n==sum){
	  System.out.println(n +" is Neon Number");
	}else{
	  System.out.println(n +" is Not  Neon Number");
	}
  }
}				