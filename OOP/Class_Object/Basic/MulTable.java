/*16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing.
*/
import java.util.*;
class MulTable{
	void printTable(int n){
		for(int i=1;i<=10;i++){
			for(int j=1;j<=n;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		MulTable mt=new MulTable();
		mt.printTable(n);
	}
}