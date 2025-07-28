/*Q16. Write a java program to find power of a number.
*/
import java.util.*;
class Power{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter a base and index");
	int base=sc.nextInt();
	int index=sc.nextInt();
	int p=1;
	while(index!=0){//3<5
	p=p*base;//1*5
	index--;//3--
	}
	System.out.println("power of number:"+p);
	
  }
}