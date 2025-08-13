/* Q55. Write a java program to display following series :

                   5  3  10  6  15  9  20  12  25  15  30  18  35  21  40*/
import java.util.*;
class Series1{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		
		int i=1;
		while(i<=7){
		System.out.print(5*i+" "+3*i+" ");
		i++;
	
		}
	 System.out.print(5 * i);
	}
}

