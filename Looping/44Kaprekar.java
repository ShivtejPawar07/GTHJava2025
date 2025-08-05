/*Q44. Write a Java program to check whether a given number is a Kaprekar number
 or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45
*/
import java.util.*;
class Kaprekar{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit");
		int limit=sc.nextInt();
		int n=1;
		while(n<=limit){
		int sq=n*n;
		int i=1,cnt=0;
		int temp=sq;
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		int d1=0,d2=0,sum=0;
		int c1=(int)Math.ceil(cnt/2.0);
		d1=sq%(int)Math.pow(10,c1);
		d2=sq/(int)Math.pow(10,c1);
		
		sum=d1+d2;
			//System.out.println(sum);
		if(sum==n)
			System.out.println(n);
		n++;
		}		
		
    }
}

