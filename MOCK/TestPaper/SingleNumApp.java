/*
8) Single Number 
Every element appears twice except one. Find that single one. 
Example 
Input: [4,1,2,1,2] → 4
*/
import java.util.*;
class SingleNumApp{
	public static void main(String[]x){
		int[] a = {4, 1, 2, 1, 2};

        int result = 0;

        for (int num : a) {
            result = result ^ num;
        }

        System.out.println(result);
	}
}
/*
0 ^ 4 = 4
4 ^ 1 = 5
5 ^ 2 = 7
7 ^ 1 = 6
6 ^ 2 = 4
*/