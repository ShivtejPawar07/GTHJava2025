/*10Write a Java program to input a 2D array (matrix) and calculate the 
sum of each row and the sum of each column, then display the results.*/
import java.util.*;
class Sum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter Array Element");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display Array Element");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++){
			int csum=0;
			int rsum=0;
			for(int j=0;j<3;j++){
				rsum=rsum+a[i][j];
				csum=csum+a[j][i];
			}
			System.out.println("Row "+(i + 1) + " = " + rsum);
			System.out.println("Column "+(i + 1) + " = " + csum);
		}
	}
}