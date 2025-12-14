/*Q2. Write a program in java to find two elements whose sum is closest to zero

Expected Output:

The given array is 38 44 63-51-35 19 84-694-46 The Pair of elements whose sum is minimum are: [44, -46]*/
import java.util.*;
class Demo{
	public static void main(String[]x){
		 int[] a = {49, 1, 3, 200, 2, 4, 70, 5};

        // Step 1: Sort the array
        Arrays.sort(a);
		int cnt=1;
		for(int i=1;i<a.length;i++){
			if(a[i]==a[i-1]+1)
				cnt++;
		}
		return cnt;
	}
}