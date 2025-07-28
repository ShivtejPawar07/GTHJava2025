/*Q17. Write a java program to find all factors of a number.
*/
import java.util.*;
class Factor{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	int n=sc.nextInt();
	int i=1;
	while(i<=n){
	 if(n%i==0){
	 System.out.println("Fact:"+i);
	 
	 }
	 i++;
	}
	
  }
}