/*Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/
import java.util.*;
class Duck{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();//1208
		boolean flag=false;
	
		while(n!=0){
			int rem=n%10;
			    if(rem==0){
					flag=true;
				}
				n=n/10;
		}
		if(flag)
			System.out.println("Duck");
		else
			System.out.println("Not Duck");
		
		
	}
	
}