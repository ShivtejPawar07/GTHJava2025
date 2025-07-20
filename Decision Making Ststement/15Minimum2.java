/*Q15. Write a java program to find the minimum between two numbers.*/
import java.util.*;
class Minimum2{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the two numbers");
	  int n1=sc.nextInt();
	  int n2=sc.nextInt();
	
	  
	    if(n1<n2){
		System.out.println(n1 +"is minimum numbers");
		}
		else{
		System.out.println(n2 +"is minimum numbers");
		}
	  
	 
   
   }
}