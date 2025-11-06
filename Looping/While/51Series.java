/*Q51. Write a java program to display following series :

                   1  2  2  4  3  6  4  8  5  10  6  12*/
				   
import java.util.*;
class Series1{
	public static void main(String x[]){
		/*Scanner sc=new Scanner(System.in);
		int i=1;
		while(i<=6){
		System.out.print(i+" "+(i*2)+" ");
		i++;
		} */
		series(1,6);
	
	}
	static void series(int i,int l){
		if(i>l)
			return;
		System.out.print(i+" "+i*2+" ");
		series(i+1,l);
	}
}
