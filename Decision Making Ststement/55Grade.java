/*Q54. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation:
 Use a char or string in switch to match grades and print remarks.*/
 
import java.util.*;
public class SwitchGrade
{
  public static void main(String x[])
  {
    char ch;
    Scanner sc = new Scanner(System.in);
	
    System.out.print("Enter a grade:");
    ch= sc.next().charAt(0);

       
        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid choice");
   }//switch  
}
}