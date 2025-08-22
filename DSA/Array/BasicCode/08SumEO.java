/*Q8. Write a java program to calculate the sum of even or odd numbers.
*/
import java.util.*;
class EOApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Elemnt In array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		int Esum=0,Osum=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==0){
				Esum=Esum+a[i];
			}
			else{
				Osum=Osum+a[i];
			}
		}
		System.out.println("Even Sum Of Array="+Esum);
		System.out.println("Odd Sum Of Array="+Osum);
	}
}