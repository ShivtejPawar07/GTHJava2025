/* Q52. Write a java program to display following series :

                   2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1         */
import java.util.*;
class Series1{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		
		int i=1,j=9;
		while(i<=9 && j>=1){
		System.out.print(i*2+" "+(j*j*j)+" ");
		i++;
		j--;
		}
	
	}
}