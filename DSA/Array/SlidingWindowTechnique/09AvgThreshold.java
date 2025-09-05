/*Q9Number of Subarrays of Size K with Average Greater Than Threshold
Count how many subarrays of size k have an average greater than a given threshold.*/

import java.util.*;
public class AvgCntThreshold{
	public static void main(String args[]){
		int k = 3;
		int threeshold = 3;
		int cnt = 0;
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		int avg = 0;
		for(int i=0;i<k;i++){
			sum += arr[i];
		}
		avg = sum / k;
		if(avg>threeshold)
			cnt++;
		
		for(int i=k;i<arr.length;i++){
			sum += arr[i] - arr[i-k];
			avg = sum / k;
			if(avg>threeshold)
				cnt++;
		}
		System.out.printf("%d",cnt);
	}
}