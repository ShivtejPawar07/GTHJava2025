/*
 **4. Number Guessing Game**

**Description:**

* System generates a random number between 1–100.
* Use a do-while loop to let the user guess the number.
* If guess is too high or low, give a hint and **continue**.
* If the guess is correct, print "You guessed it!" and **break**.

*/

import java.util.*;
class RandomApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	do{
		Random r= new Random();
		int rNum=r.nextInt(100);
		System.out.println("Random Number:"+rNum);
		
		System.out.println("Enter the Guess Number");
		int gNum=sc.nextInt();
		
		if(rNum==gNum){
			System.out.println("You guessed it!");
			break;
		}
		else if(rNum>gNum){
			System.out.println("Low");
		}
		else{
			System.out.println("High");
		}
	}while(true);	
		
		
	}

}