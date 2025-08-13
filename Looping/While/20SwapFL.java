/*Q20. Write a java program to swap first and last digits of a number.*/
import java.util.*;
class SFAPP
{   public static void main(String x[])
	{ Scanner xyz  = new Scanner(System.in);
	   int n,p,temp,count=0;
	   System.out.println("Enter number from keyboard");
	   n=xyz.nextInt();//1234
	   temp=n;
	   System.out.println("Before swap  "+n);
	   while(n!=0){
		   n/=10;
		   count++;
	   }
	   n=temp;
	   p=(int)Math.pow(10,--count);//1000
	   n=(n%10)*p+((n%p)/10*10)+(n/p);
	   System.out.println("After Swap:"+n);
	}
}	