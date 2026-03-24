/*Q1. Write a Java program to find the largest and smallest digit of a given number. */
import java.util.*;
class LSNumApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		while(n!=0){
			int rem=n%10;
			if(rem>max)
				max=rem;
				
			if(rem<min)
				min=rem;
				
			n=n/10;
		}
		System.out.println("MAximum="+max);
		System.out.println("Minimum="+min);
	}
}