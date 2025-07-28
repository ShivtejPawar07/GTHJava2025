/*Factorial */
import java.util.*;
class Fact{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int i=1,fact=1;
	while(i<=n){
	  fact *=i;
	  i++;
	}
	System.out.println("Factorial:"+fact);
  }
}