/*Q2. Write a java program to find the frequency of each digit in a given integer. */
import java.util.*;
class Frequency{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		int n=sc.nextInt();
		
		freq[] f=new freq[10];
		
		while(n!=0){
			int rem=n%10;
			freq[rem]++;
			n/=10;
		}
		
		for(int i=0;i<9;i++){
			 System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
		}
	}
}