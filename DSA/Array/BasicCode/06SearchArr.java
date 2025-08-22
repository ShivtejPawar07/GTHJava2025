/*Q6. Write a java program to search element in array , its element found or not.
*/
import  java.util.*;
class Arr{
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
		System.out.println("Enter the search element in an Array Elemnt");
		int s=sc.nextInt();
		int pos=-1;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++){
			if(s==a[i]){
				flag=true;
				pos=i;
				break;
			}
		}
		if(flag)
			System.out.printf("Element is found %d at index %d",s,pos);
		else
			System.out.printf("Element %d is not found found",s);
		
	}
}