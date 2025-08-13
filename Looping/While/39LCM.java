/*Q39. Write a java program to find LCM of two numbers.
Definition: The LCM of two numbers, say 'a' and 'b', is the smallest positive integer that is divisible by both 'a' and 'b'. 
Example: Let's find the LCM of 4 and 6: 
Multiples of 4: 4, 8, 12, 16, 20, 24...
Multiples of 6: 6, 12, 18, 24, 30...
Common multiples of 4 and 6: 12, 24...
The smallest common multiple is 12. So, the LCM of 4 and 6 is 12.
*/

import java.util.*;
class LCM{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Number");
	int n1=sc.nextInt();//10
	int n2=sc.nextInt();//5
	int i=1,gcd=0;
	/*while(i<=n1 && i<=n2){
	  if(n1%i==0 && n2%i==0){
	    gcd=i;
	  }
	  i++;
	}
	System.out.println("Gcd:"+gcd);
	System.out.println("Lcm:"+((n1*n2)/gcd));
	*/
	int max=n1>n2?n1:n2;
	while(true){
	  if(max%i==0 && max%i==0){
	    System.out.println("LCM:"+max);
		break;
	  }
	  max++;
	}
	
	
  }
}