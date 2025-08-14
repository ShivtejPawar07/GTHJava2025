/*
 **6. Temperature Logger**

**Description:**

* Ask the user to enter daily temperatures.
* Use **continue** if the entered temperature is negative (invalid reading).
* Use **break** if the user enters "stop".
* Keep looping with do-while until break condition.

*/
import java.util.*;
class Temperature{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		String temp;
		do{
			System.out.println("Enter the Today Temperature");
			temp=sc.nextLine();
			if(temp.equalsIgnoreCase("stop")){ 
				break;
				}
				int t=Integer.parseInt(temp);
			if(t<0){
		        System.out.println("Invalid Reading");
                continue;
			}
			
				System.out.println("Accept Reading");
			
			
		}while(true);
		
		System.out.println("Temperature logging stopped.");
		
		
	}
}