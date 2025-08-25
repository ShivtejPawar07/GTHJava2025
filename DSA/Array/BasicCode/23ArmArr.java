/*Q23. Write a java program to find armstrong number of a array. 
.*/
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
		
		for(int i=0;i<a.length;i++){
			int temp=a[i];
			int cnt=0;
			while(temp!=0){
				temp=temp/10;
				cnt++;
			}
			//System.out.print(cnt+" ");
			temp=a[i];
			int sum=0;
			while(temp>0){
			int digit=temp%10;
			sum+=((int)Math.pow(digit,cnt));
			temp/=10;
			}
			//System.out.print(sum+" ");
			if(sum==a[i]){
			System.out.print(a[i]+" ");
			}
		}	
	}
}