/***7. Train Ticket Booking**

**Description:**

* Ask the user to select a seat number.
* If seat is already booked (use a sample booked seat list), **continue** to ask again.
* If the user enters "exit", **break** the loop.
* Use a do-while loop to keep asking until a valid seat is booked.
*/
import java.util.*;
class Ticket{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		String sNum;
		
		do{
			System.out.println("Enter a seat Number(1-5)");
		    sNum =sc.nextLine();//1
			sNum=sNum.toLowerCase();
			boolean flag=true;
			boolean s1=false,s2=true,s3=false,s4=true,s5=false;
			switch(sNum){
				case "1":
				    if(s1){
						System.out.println("seat already book");
						continue;
					}
					System.out.println("seat book successfully");
					s1=true;
					flag=true;
				
				break;
				case "2":if(s2){
						System.out.println("seat already book");
						continue;
					}
					System.out.println("seat book successfully");
					s1=true;
					flag=true;
				break;
				case "3":if(s3){
						System.out.println("seat already book");
						continue;
					}
					System.out.println("seat book successfully");
					s1=true;
					flag=true;
				break;
				case "4":if(s4){
						System.out.println("seat already book");
						continue;
					}
					System.out.println("seat book successfully");
					s1=true;
					flag=true;
				break;
				case "5":if(s5){
						System.out.println("seat already book");
						continue;
					}
					System.out.println("seat book successfully");
					s1=true;
					flag=true;
				break;
				case "Exit":System.out.println("thank you..!");
				default:
					if(sNum.equalsIgnoreCase("Exit")==false)
					System.out.println("Invalid Condition");
				break;
			}
			if(flag)
				break;
			
		}while(sNum.equalsIgnoreCase("Exit")==false);	
		
		
		
	}

}