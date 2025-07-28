/*Q38. Write a java program to find HCF (GCD) of two numbers.*/

import java.util.*;
class Gcd{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Number");
	int n1=sc.nextInt();//10
	int n2=sc.nextInt();//5
	int i=1,gcd=0;
	while(i<=n1 && i<=n2){
	  if(n1%i==0 && n2%i==0){
	    gcd=i;
	  }
	  i++;
	}
	System.out.println("Gcd:"+gcd);
	
  }
}
