/*12.Problem Statement:
 Write a menu-driven program using do-while and switch-case to:
Check if a number is prime.
Find the sum of digits of a number.
Reverse a number.
Exit.
Perform operations repeatedly until the user selects exit.
*/
import java.util.*;
class MD{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter the Number");
			int n=sc.nextInt();
		do{
			System.out.println("1:Prime");
			System.out.println("2:Sum Of digit");
			System.out.println("3:Reversed Number");
			System.out.println("4:Exit");
			System.out.println("Enter a choice");
			ch=sc.nextInt();
			
			switch(ch){
				case 1:
						boolean flag=true;
						for(int i=2;i<=n/2;i++){
							if(n%i==0){
								flag=false;
								break;
							}						
						}
						if(flag){
							System.out.println("Number is Prime");
						}
						else{
							System.out.println("Number is not Prime");
						}
						
				break;
				case 2:
				        int temp=n;
				        int sum=0;
						while(n!=0){
							int rem=n%10;
							sum+=rem;
							n/=10;
						}
						System.out.println("Sum of digit="+sum);
						n=temp;
				break;
				case 3:
				        
						int rev=0;
						while(n!=0){
							int rem=n%10;
							rev=rev*10+rem;
							n/=10;
						}
						System.out.println("Reversed Of Number="+rev);
						
				break;
				case 4:
						System.out.println("Thank you Visit again");
				break;
				
				default:
				System.out.println("Invalid Choice");
			}
			
			
		}while(ch!=4);	
		
		
		
	}
}