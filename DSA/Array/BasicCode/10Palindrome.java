/*Q10.Write a java program to check array is palindrome or not.*/
import  java.util.*;
class Palindrome{
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
		boolean flag=true;
		for(int i=0;i<(a.length/2);i++){
			if(a[i]!=a[a.length-1-i]){
				flag=false;
			}
		}
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
}