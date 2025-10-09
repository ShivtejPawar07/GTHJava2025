/*Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/
import java.util.*;
class Happy{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0,rem;
		int temp=n;
		while(n!=1 && n!=4){ 
			sum=0;
			while(n!=0){
				rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
				
			}
			n=sum;
		}
		String result= n==1?"Happy":"Not";
		System.out.println(result);
	}
}