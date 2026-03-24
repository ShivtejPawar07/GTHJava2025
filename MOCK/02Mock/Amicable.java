/*Write a java program to check whether number is amicable number or not.

Amicable numbers are two different numbers so related that the sum of the 
proper divisors of each is equal to the other number.
 (A proper divisor of a number is a positive factor of that number other than the number itself.

Examples: (220,284)

Proper divisors of 220: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110

Sum=1+2+4+5+10+11+20+22+44+55 +110 = 284

Proper divisors of 284: 1, 2, 4, 71, 142

Sum=1+2+4+71+142 220

Thus, (220, 284) is a pair of amicable numbers.*/

import java.util.*;
class Amicable{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n1sum=0,n2sum=0;
		for(int i=1;i<=n1/2;i++){
			if(n1%i==0)
				n1sum=n1sum+i;
		}
		for(int i=1;i<=n2/2;i++){
			if(n2%i==0)
				n2sum=n2sum+i;
		}
		if (n1sum == n2 && n2sum==n1) {
            System.out.println(n1 + " and " + n2 + " are Amicable Numbers.");
        } else {
            System.out.println(n1 + " and " + n2 + " are NOT Amicable Numbers.");
        }
	}
}