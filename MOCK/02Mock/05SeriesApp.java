/*Q5. Write a Java program to display the following series using function :  
 3   6   12   24   48   96  192  
 (Each term doubles from the previous term starting at 3) */
import java.util.*;
class SApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		/*for(int i=3;i<=192;i=i*2){
			//i=3 i=3*2=6 ......
			System.out.print(i+" ");
		}
		*/
		System.out.println("ENter the limit of  Series");
		int n=sc.nextInt();
		series(n);//function call
	}
	public static void series(int n){
		//function def
		for(int i=3;i<=n;i=i*2){
			System.out.print(i+" ");
		}
	}
}