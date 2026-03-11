/*Q1. Write a program to find the third largest element in a given integer array. If the array contains duplicate 
values, consider only distinct elements. 
Input: n = 7   Array = 12 35 1 10 34 35 12 
Output: Third Largest Element = 12 */

import java.util.*;

class ThirdLargest{
    public static void main(String[] args){

        int arr[] = {12,35,1,10,10,34,35,12};

		/*
		Use Collection
        TreeSet<Integer> ts = new TreeSet<>();

        for(int num : arr){
            ts.add(num);
        }

        Iterator<Integer> it = ts.descendingIterator();

        it.next();
        it.next();
        int third = it.next();

        System.out.println("Third Largest Element = " + third);
		*/
		int f=Integer.MIN_VALUE;
			int s=Integer.MIN_VALUE;
			int t=Integer.MIN_VALUE;
			
		for(int n:arr){
			if(n>f){
				t=s;
				s=f;
				f=n;
			}
			else if(n>s && n!=f){
				t=s;
				s=n;
			}
			else if(n>t &&  n!=f && n!=s){
				t=n;
			}
			
		}
		System.out.println("Third Largest Element = " + t);
    }
}