// 8. Longest Subarray with Sum ≤ K
// Approach: Sliding Window using i & j
// Example: arr = [1,2,1,0,1,1,0], k = 4 → Length: 5

class LongestSubarray {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 0, 1, 1, 0};
        int K = 4;  // sum limit

        int i=0;     // start of window
        int sum=0;
        int maxLen=0;

        for (int j = 0; j < a.length; j++) { // j = end of window
            sum += a[j];  // expand window by adding a[j]

            // shrink window until sum ≤ K
            while (sum > K) {
                sum -= a[i];  // remove a[i] from sum
                i++;          // move start forward
            }

            // update max length
            maxLen = Math.max(maxLen, j - i + 1); /*// update max length manually
														int windowLen = j - i + 1;
														if (windowLen > maxLen) {
															maxLen = windowLen;
														}
			                                          */
        }

        System.out.println("Longest Subarray Length = " + maxLen);
    }
}
/*
class MaxLen{
	public static int maxLen(int[]a,int k){
		int i=0,sum=0,max=0;
		for(int j=0;j<a.length;j++){
			sum+=a[j];
			while(sum>k){
				sum-=a[i];
				i++;
			}
			int wl=j-i+1;
			if(wl>max){
				max=wl;
			}
		}
		return max;
	}
	public static void main(String x[]){
		int[]a={1,2,1,0,1,1,0};
		int k=4;
		System.out.println("Max="+maxLen(a,k));
	}
	
}
*/
/*
Problem

Find the longest subarray whose sum ≤ K.

Use Sliding Window with two pointers i (start) and j (end).

Example:

arr = [1, 2, 1, 0, 1, 1, 0], K = 4

Variables
Variable	Meaning
i	Start of the current window
j	End of the current window
sum	Sum of elements in the current window
maxLen	Maximum length of a valid window so far
Steps

Step 0: Initial state

i = 0, sum = 0, maxLen = 0

Step 1: j = 0 → window [0..0] = [1]

Add a[0] → sum = 1

sum ≤ K → valid window, no shrinking

Window length = j - i + 1 = 0 - 0 + 1 = 1

Update maxLen = 1

Step 2: j = 1 → window [0..1] = [1,2]

Add a[1] → sum = 1 + 2 = 3

sum ≤ K → valid window

Window length = 1 - 0 + 1 = 2

Update maxLen = 2

Step 3: j = 2 → window [0..2] = [1,2,1]

Add a[2] → sum = 3 + 1 = 4

sum ≤ K → valid window

Window length = 2 - 0 + 1 = 3

Update maxLen = 3

Step 4: j = 3 → window [0..3] = [1,2,1,0]

Add a[3] → sum = 4 + 0 = 4

sum ≤ K → valid window

Window length = 3 - 0 + 1 = 4

Update maxLen = 4

Step 5: j = 4 → window [0..4] = [1,2,1,0,1]

Add a[4] → sum = 4 + 1 = 5

sum > K → shrink window from start:

Subtract a[i] → sum = 5 - 1 = 4

Move i = 1

Window length = 4 - 1 + 1 = 4

maxLen stays 4

Step 6: j = 5 → window [1..5] = [2,1,0,1,1]

Add a[5] → sum = 4 + 1 = 5

sum > K → shrink window:

Subtract a[i] → sum = 5 - 2 = 3

Move i = 2

Window length = 5 - 2 + 1 = 4

maxLen stays 4

Step 7: j = 6 → window [2..6] = [1,0,1,1,0]

Add a[6] → sum = 3 + 0 = 3

sum ≤ K → valid window

Window length = 6 - 2 + 1 = 5

Update maxLen = 5 ✅

Final Result
Longest Subarray Length = 5


Longest subarray: [1,0,1,1,0]

Sum = 3 ≤ 4

Summary

Expand window by adding a[j].

Shrink window from i if sum > K.

After each step, window length = j - i + 1.

Update maxLen if the current window is longer.

If you want, I can also draw this as a simple table with all values of i, j, sum, window length, maxLen — looks very easy to visualize.
*/