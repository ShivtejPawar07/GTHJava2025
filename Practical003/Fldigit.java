/*Q22. Write a program to find first and last digit of a number without using loop in three digit.*/
public class Fldigit{
  public static void main(String []x){
     int n=Integer.parseInt(x[0]);

	 System.out.println("Last Digit:"+n%10);
	  System.out.println("First Digit:"+n/100);
	 
  }
}