/*14. Write a menu-driven program using switch and do-while to perform operations on a single number:
Count the number of digits
Count how many digits are even
Find the product of all odd digits
Check if the number is an Armstrong number
Exit the program
*/
import java.util.*;
class MD{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter the Number");
			int n=sc.nextInt();
		do{
			System.out.println("1:Count the number of digits");
			System.out.println("2:Count how many digits are even");
			System.out.println("3:Find the product of all odd digits");
			System.out.println("4:Check if the number is an Armstrong number");
			System.out.println("5:Exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			
			switch(choice){
				
				case 1:
				int temp=n;
				int cnt=0;
						while(temp!=0){
							int rem=temp%10;
							cnt++;
							temp/=10;
						}
						System.out.println("Count No Of Digit :"+cnt);
					
				break;
				case 2:
				 temp=n;
				       int Ecnt=0;
						while(temp!=0){
							int rem=temp%10;
							if(rem%2==0)
							 Ecnt++;
							temp/=10;
						}
						System.out.println("Count No Of Digit Even:"+Ecnt);
						
				break;
				case 3:
				    temp=n;
				       int pro=1;
						while(temp!=0){
							int rem=temp%10;
							if(rem%2!=0)
							 pro=pro*rem;
							temp/=10;
						}
						System.out.println("Product of all Odd digit:"+pro);
						
						
				break;
				case 4:
						
					   temp=n;
				       cnt=0;
						while(temp!=0){
							int rem=temp%10;
							cnt++;
							temp/=10;
						}
						
						System.out.println(cnt);
						temp=n;
						int sum=0;
						while(temp!=0){
						int rem=temp%10;
						sum=sum+((int)(Math.pow(rem,cnt)));
						temp/=10;
						}
						System.out.println(sum);
						if(sum==n)
							System.out.println("Armstrong");
						else
							System.out.println("Not Armstrong");
				break;
				case 5:
						System.out.println("Thank you Visit again");
				break;
				
				default:
				System.out.println("Invalid Choice");
			}
		}while(choice!=5);
    }
}	