/*Q15. Write a java program to print all ASCII characters with their values.*/
import java.util.*;
class Ascii{
  public static void main(String x[]){
    Scanner sc=new Scanner(System.in);
	
	int i=1;
	while(i<=255){
      System.out.println(i+"="+(char)i);
	  i++;
	}
	
  }
}