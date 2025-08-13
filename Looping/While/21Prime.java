/*Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/
import java.util.*;
class Prime{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();
	boolean isprime=true;
	int i=2;
	if(n<=1)
	  isprime=true;
	  
	  while(i<=n/2){
	    if(n%i==0){
		isprime=false;
		break;
		
		}
	  i++;
	  }
	  if(isprime)
	   System.out.println("Prime");
	  else
	   System.out.println("Not");
  }
}
/*import java.util.*;
class PrimeN{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();//11
	int i=1,cnt=0;

	while(i<=n){ //1<=11
	  if(n%i==0){//11%1==0
	   cnt++;//1
	  }
	  i++;//1++
	}
	String msg= (cnt==2)?"Prime":"Not";
	System.out.println(msg);
  }
}*/