import java.util.*;
class LinearSearch{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Array Elemnt");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Elemnt");
		for(int i=0;i<a.length;i++){
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		System.out.println("Enter a search elemnt");
		int skey=sc.nextInt();
		int index=search(skey,a);
		if(index==-1)
			System.out.println("Element Not Found");
		else
			System.out.println("Element"+skey+" found at index"+index);
	}
	static int search(int skey,int[]a){
		int index=-1;
		for(int i=0;i<a.length;i++){
			if(skey==a[i]){
				index=i;
				break;
			}
		}
		return index;
	}
}