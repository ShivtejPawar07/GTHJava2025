/*Q2. Write a java program to find the frequency of each digit in a given integer. */
import java.util.*;
class Frequency{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		int n=sc.nextInt();
		
		int[] freq=new int[10];
		
		while(n!=0){
			int rem=n%10;
			freq[rem]++;
			n/=10;
		}
		
		for(int i=0;i<9;i++){
			 if (freq[i] > 0)
			 System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
		}
	}
}
/*Step	Operation	Digit Extracted	Updated Frequency Array (freq)
1	455430 % 10	0	[1,0,0,0,0,0,0,0,0,0]
2	45543 % 10	3	[1,0,0,1,0,0,0,0,0,0]
3	4554 % 10	4	[1,0,0,1,1,0,0,0,0,0]
4	455 % 10	5	[1,0,0,1,1,1,0,0,0,0]
5	45 % 10	5	[1,0,0,1,1,2,0,0,0,0]
6	4 % 10	4	[1,0,0,1,2,2,0,0,0,0] */