/*Q46.Chef is watching TV. The current volume of the TV is XX. 
Pressing the volume up button of the TV remote increases the volume 
by 11 while pressing the volume down button decreases the volume by 11.
 The chef wants to change the volume from XX to YY. Find the minimum number
 of button presses required to do so.
Input Format
• 	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
 
• 	The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.
• 	
Output Format
For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.
Constraints
1<=T <=100
1<=X<=Y<=100
 
Input         	Output 2
50 54        	4
12 10        	2
 
Explanation:
Test Case 1: Chef can press the volume up button 4 times to increase the volume from 50 to 54.
Test Case 2: Chef can press the volume down button 2 times to decrease the volume from 12 to 10.
*/
import java.util.*;

class VolumeControl {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int T = sc.nextInt();  // number of test cases

        while (T > 0) {
            System.out.println("Enter current volume:");
            int X = sc.nextInt(); 

            System.out.println("Enter target volume:");
            int Y = sc.nextInt(); 

            if (X >= 1 && X <= 100 && Y >= 1 && Y <= 100) {
                int presses = Math.abs(X - Y);  // cleaner way to get difference

                if (X > Y)
                    System.out.println("Chef needs to press button " + presses + " times to volume down");
                else if (X < Y)
                    System.out.println("Chef needs to press button " + presses + " times to volume up");
                else
                    System.out.println("No button press needed. Volume is already at desired level.");
            } else {
                System.out.println("Please enter current and target volume between 1 and 100.");
            }

            T--;
        }
    }
}
