/*Q4Find First Negative Number in Every Window of Size K
For each window of size k, find the first negative number.
*/
import java.util.*;
class array{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]={12,-1, -7, 8, -15, 30, 16, 28};
		int k=3;
        
        for(int i=0;i<=a.length-k;i++){
			boolean flag=false;
            for(int j=i;j<i+k;j++){
				if(a[j]<0)
				{
					System.out.println("First negative in "+(i+1) +" window"+a[j]);
					flag=true;
					break;
				}
            }
			if(flag==false)
				System.out.println("Not found");
			System.out.println();
		} 
	}
}
