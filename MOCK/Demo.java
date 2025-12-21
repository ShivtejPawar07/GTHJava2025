/*7. Minimum Size Subarray Sum
Description:
Find minimal length of a subarray whose sum ≥ target.
Example:
Input: target=7, nums=[2,3,1,2,4,3]
Output: 2
*/

import java.util.*;

class MinimumSubArr {
    public static void main(String[] x) {
        int[] a = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int sum = 0;
        int i = 0;
        int minLen = Integer.MAX_VALUE;

        for (int j = 0; j < a.length; j++) {
            sum += a[j];

            // shrink window while condition satisfied
            while (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= a[i];
                i++;
            }
        }

        // if no valid subarray found
        if (minLen == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(minLen);
    }
}
