/*Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.*/
import java.util.*;
class StudScore{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the score");
	  int n=sc.nextInt();
	  
	  if(n>=90){
	  System.out.println("Student Excellent");
	  }
	  else if(n>=75 && n<90){
	  System.out.println("Student Good");
	  }
	  else if(n>=50 && n<75){
	  System.out.println("Student Average");
	  }
	  else{
	    System.out.println("Student poor");
	  }
   
   }
}