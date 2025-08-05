/*Q54. Write a java program to display following series :

                   1  2  4  7  11  16  22  29  37  46.
	*/
import java.util.*;
class Series4{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int i=1,d=1;
		System.out.print(i+" ");
		while(i<=10){
		d=d+i;
		System.out.print(d+" ");
		i++;
		}
	
	}
}	