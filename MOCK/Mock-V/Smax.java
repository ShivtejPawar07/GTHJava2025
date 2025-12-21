/*Q1. Write a java program to give an array, find the second largest element without sort array. 
Input : Array = {12, 35, 1, 10, 34, 1} 
Output : Second largest = 34 
Explanation: 
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, 
secondLargest). */

import java.util.*;
class Smax{
	public static void main(String[]x){
		int[] a={12, 35, 1, 10, 34, 1};
		
		int max=Integer.MIN_VALUE;
		int	smax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max){                                  
				smax=a[i];
			}
		}
		System.out.println("Smax="+smax);
	}
}