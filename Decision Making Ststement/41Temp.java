/*41Classify temperature reading:
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.*/
import java.util.*;
class Temp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature");
		int t=sc.nextInt();
		if(t<0)
			System.out.println("Temperature is Freezing");
		else if(t>=0 && t<=20)
			System.out.println("Temperature is Cold");
		else if(t>=21 && t<=35)
			System.out.println("Temperature is Warm");
		else
			System.out.println("Temperature is Hot");
			
		
	}
	
}