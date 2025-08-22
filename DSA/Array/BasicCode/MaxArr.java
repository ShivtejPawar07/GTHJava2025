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
		
		int max=a[0];
		int smax=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(a[i]>max){
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max){
				smax=a[i];
			}
			else{
			}
		}
		  if(smax!=Integer.MIN_VALUE)
	      {
	       System.out.println("Second Max value is  "+smax);
	      }
	      else{
		    System.out.println("There is no seconod max value");
	      }

	}
}