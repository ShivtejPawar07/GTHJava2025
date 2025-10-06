/*
9. Count Subarrays of Size K with Avg ≥ Target

Approach: Sliding Window
Example: arr = [2,1,3,4,1,2], k = 3, avg = 2 → Count: 2
*/
import java.util.*;

class FirstNeg {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element in an array");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = 3;       // window size
        int tsum = 6;    // target sum (target avg * k)
        int cnt = 0;     
        int sum = 0;
	

        // Step 1: First window sum
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
		
        // Step 2: Check first window
        if (sum >= tsum) {
            cnt++;
        }

        // Step 3: Slide the window
        for (int i = k; i < a.length; i++) {
            sum += a[i] - a[i - k]; // remove leftmost, add rightmost
            if (sum >= tsum) {
                cnt++;
            }
        }

        // Step 4: Print result
        System.out.println("Count " + cnt);
    }
}
