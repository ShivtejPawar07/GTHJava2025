/* Print a grade using ternary operators:

90+: A
80–89: B
70–79: C
<70: F
*/

import java.util.*;
public class StudentGrade{
  public static void main(String x[]){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the score");
	 Double s=sc.nextDouble();
	
	 String result=(s>=90 && s<=100) ? "Grade:A":
				   (s>=80 && s<=89)?"Grade:B":
				   (s>=70 && s<=79)?"Grade:C":
				     "Grade:F";
				 
	 System.out.println(result);
  
  }
}