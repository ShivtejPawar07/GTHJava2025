/*4. Write a program to input numbers and print its table?
*/
import java.util.*;
class Table{
	public static void table(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n*i);
		}
	}
}
class TableApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		Table.table(n);
		
	}
}