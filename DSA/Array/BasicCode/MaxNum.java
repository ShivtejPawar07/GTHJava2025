import java.util.*;
class AApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Element in array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]----->%d\n",i,a[i]);
		}
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max)
			max=a[i];
		}
		System.out.printf("Max Elemnt=%d\n",max);
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<min)
			min=a[i];
		}
		System.out.printf("Min Elemnt=%d\n",min);
		
		System.out.printf("Enter a search Element\n");
		int s=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==s){
				flag=true;
				break;
			}
			
		}
		if(flag){
			System.out.printf("Search Element is %d found\n",s);
		}
		else{
			System.out.printf("Not Found");
		}
		
		
	}
}