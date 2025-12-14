/*Q45. Write a Java program to check whether a given number is a Disarium number or
 not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective
 positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate
 the digit raised to its position power using only loops (no Math.pow()).
 Check if the sum equals the original number.*/

/*import java.util.*;
class Disarum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int temp=n;
		int cnt=0;
		while(temp!=0){
			 temp/=10;
			cnt++;
		}
		temp=n;
		int sum=0;
		int pos=cnt;
		while(temp!=0){
			int rem=temp%10;//5
			
			int p=1,i=1;
			
			while(i<=pos)
			{
				p=p*rem;
				i++;
			}
			sum=sum+p; 
			
			temp/=10;
			pos--;
			
		}
	 if(sum==n)
		 System.out.println("Disarium number");
     else
		 System.out.println("Not Disarium number");
		 
		 
	 
	}

}*/
import java.util.*;
class Disarum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Limit");
		int limit=sc.nextInt();
		int n=1;
		while(n<=limit){
		int temp=n;
		int cnt=0;
		while(temp!=0){
			 temp/=10;
			cnt++;
		}
		temp=n;
		int sum=0;
		int pos=cnt;
		while(temp!=0){
			int rem=temp%10;//5
			
			int p=1,i=1;
			
			while(i<=pos)
			{
				p=p*rem;
				i++;
			}
			sum=sum+p; 
			
			temp/=10;
			pos--;
		}
	 if(sum==n)
		 System.out.print(n+" ");
	 n++;	 
		}
	}

}