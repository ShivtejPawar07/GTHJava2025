/*3. Top K Frequent Elements (LC 347)
Description:
 Return the k most frequent elements.
Example:
 Input: [1,1,1,2,2,3], k = 2
 Output: [1,2]
Approach (HashMap + PriorityQueue):
Count frequency using HashMap
Use max heap based on frequency
Extract top k
*/

import java.util.*;

class Frequent {
    public static void main(String[] x) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        // Step 1: Count frequency using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        // Step 3: Extract top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        // Output
        System.out.println(Arrays.toString(result));
    }
}
