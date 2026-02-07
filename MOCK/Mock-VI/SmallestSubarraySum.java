/*Q4. Problem: 
Given an array of positive integers and a target sum S, find the length of the smallest contiguous 
subarray whose sum is greater than or equal to S. If no such subarray exists, return 0. 
Example: 
Input: arr = [2,3,1,2,4,3], S = 7 
Output: 2 (subarray [4,3]). 
Explanation: 
Expand window until the sum ≥ S. Then shrink from the left while maintaining the condition to 
minimize length.*/

class SmallestSubarraySum {
    public static int minSubArrayLen(int S, int[] arr) {
        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= S) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int S = 7;

        System.out.println(minSubArrayLen(S, arr)); // Output: 2
    }
}
