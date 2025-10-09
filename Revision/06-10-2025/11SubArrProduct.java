/*4. Subarray Product < K

Problem:
Given an array arr[] of positive integers and integer K, find the number of contiguous subarrays whose product is less than K.

Approach / Explanation:
Use sliding window with two pointers and maintain the current product:

If K ≤ 1, return 0 (since product of positives ≥ 1).

left = 0, product = 1, count = 0.

For right from 0 to n - 1:
  multiply product *= arr[right].
  While product ≥ K and left ≤ right, divide product /= arr[left] and left++.
  Then all subarrays ending at right with start between left and right are valid, so add (right - left + 1) to count.


Example:
arr = [10, 5, 2, 6], K = 100
Valid subarrays: [10], [5], [2], [6], [5,2], [2,6], [5,2,6] = total 8
*/
class SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0;

        int left = 0, count = 0;
        double product = 1;

        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];

            // shrink window if product too big
            while (product >= k && left <= right) {
                product /= arr[left];
                left++;
            }

            // add number of valid subarrays ending at right
            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int k = 100;
        System.out.println("Count = " + numSubarrayProductLessThanK(arr, k));
    }
}
