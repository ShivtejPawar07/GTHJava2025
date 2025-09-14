/*Q1 Q1. Task: For a number n, calculate: 
   Sum of digits at even places (from right) 
   Sum of digits at odd places (from right) 
   Finally print the difference of these sums. 
   Example: n = 572631 → even places sum = 7+6+1 = 14,  
odd places sum = 5+2+3 = 10 → difference = 4.*/
import java.util.*;
class SApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int temp=n;//572631
		int cnt=0;
		//count the digit 
		while(temp!=0){
			temp/=10;
			cnt++;
		}
		int Esum=0,Osum=0;
		for(int i=1;i<=cnt;i++){
			int rem=n%10;//separete one by one digit i.e 572631%10=1...
			//Even odd logic
			if(i%2==0){
				Osum+=rem;
			}
			else{
				Esum+=rem;
			}
			n=n/10;
		}
		System.out.println("Even Sum="+Esum);//even sum
		System.out.println("Odd Sum="+Osum);//odd sum
		System.out.println("Difference="+(Esum-Osum));//difference
	}
}