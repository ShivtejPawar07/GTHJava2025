/*Q11. Write a java program to find a maximum between three numbers.*/
import java.util.*;
class Minimum3{
   public static void main(String x[]){
      Scanner sc=new Scanner(System.in);
	  System.out.println("enter the three numbers");
	  int n1=sc.nextInt();
	  int n2=sc.nextInt();
	  int n3=sc.nextInt();
	  
	    if(n1<n2 && n1<n3){
		System.out.println(n1 +"is minimum numbers");
		}
		else if(n2<n1 && n2<n3){
		System.out.println(n2 +"is minimum numbers");
		}
		else{
		System.out.println(n3 +"is minimum numbers");
		}
	  
	 
   
   }
}