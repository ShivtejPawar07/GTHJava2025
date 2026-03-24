/*Q3. Write a java program to check if a number is a happy number or not. 
 
Input: n = 19 
         Output: 19 is Happy Number, */
		 
import java.util.*;
class HApp{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ennter a number");
		int n=sc.nextInt();
		
		while(n!=4 && n!=1){
			int sum=0;
			while(n!=0){
				int rem=n%10;
				sum+=rem*rem;
				n/=10;
			}
			n=sum;
		}
		if(n==1)
			System.out.println("Happy");
		else
			System.out.println("Happy Not");
	}
}