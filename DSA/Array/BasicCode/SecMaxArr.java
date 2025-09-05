/*WAP to enter the five element and display in asecond largest elemnt array ?*/
import java.util.*;
class Demo{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Elemnet in Array");
		int n=sc.nextInt();

		int []a=new int [n];
	
		System.out.println("Enter array");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display array");
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		//10 20 40 40
		int max=Integer.MIN_VALUE;
		int smax=0;
		for(int i=0;i<n;i++){
			if(a[i]>smax||a[i]>max){//10>10 //20>10 //30>20 //40>30
				smax=max;        //smax=10  20   //30
				max=a[i];		//max=100 //30   //40
			}
			/*else if(a[i]>smax && a[i]!=max){//used by duplicate
				smax=a[i];
			}
			else{
			}*/
		}
		  
	       System.out.println("Second Max value is  "+smax);
	       System.out.println("Max value is  "+max);
	     

	}
}