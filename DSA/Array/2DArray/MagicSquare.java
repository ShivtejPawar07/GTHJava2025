import java.util.*;
class Magic{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int[][]a=new int[3][3];
		System.out.println("Enter Array Element");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int magicsum=0;
		
		//Reference sum
		for(int j=0;j<3;j++){
			magicsum+=a[0][j];
		}
		//check rowsum
		for(int i=1;i<3;i++){
			int rowsum=0;
			for(int j=0;j<3;j++){
				rowsum+=a[i][j];
			}
			if(rowsum!=magicsum){
				System.out.println("Not magic square Num");
				return;
			}
		}
		//check colsum
		for(int j=0;j<3;j++){
			int colsum=0;
			for(int i=0;i<3;i++){
				colsum+=a[i][j];
			}
			if(colsum!=magicsum){
				System.out.println("Not magic square Num");
				return;
			}
		}
		//check diagonal
		int d1=0;
		for(int i=0;i<3;i++){
			d1+=a[i][i];
		}
		if(d1!=magicsum){
				System.out.println("Not magic square Num");
				return;
			}
		int d2=0;
		for(int i=0;i<3;i++){
			d2+=a[i][3-1-i];
		}
		if(d2!=magicsum){
				System.out.println("Not magic square Num");
				return;
		}
		// If all conditions true
        System.out.println("It is a Magic Square!");
		
		
	}
}