import java.util.*;
class Search{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many element in an array");
		int n=sc.nextInt();
		
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Enter the Search Key");
		int s=sc.nextInt();
		int index = -1;
		boolean flag=false;
		for(int i=0;i<n;i++){
			if(a[i]==s){
				index=i;
				flag=true;
			}
		}
		 if (flag)
            System.out.println("Element " + s + " is Found at index " + index);
        else
            System.out.println("Element " + s + " is Not Found");
		
	}
}
