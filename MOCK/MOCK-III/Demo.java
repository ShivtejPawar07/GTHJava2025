/*Q5. Write a java program to find the maximum product of two integers in a given array of 
integers.    
Example: 
Input :  
nums = { 2, 3, 5, 7, -7, 5, 8, -5 } 
Output:  
Pair is (7, 8), Maximum Product: 56 */

import java.util.*;
class Demo{
	public static void main(String[]x){
		Scanner sc=new Scanner(System.in);
		int[]a={2, 3, 5, 7, -7, 5, 8, -5};
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
		Arrays.sort(a);
		
		int n1=0;
		int n2=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int product=a[i]*a[j];
				if(product>max){
					max=product;
					n1=a[i];
					n2=a[j];
				}
			}
		}
		System.out.printf("(%d,%d)",n1,n2);
	}
}