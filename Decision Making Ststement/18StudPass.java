/*Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.*/
import java.util.*;
class StudPass{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the score");
	  int n=sc.nextInt();
	  
	  if(n>40){
	  System.out.println("Student pass");
	  }
	  else{
	  System.out.println("Student fail");
	  }
   
   }
}