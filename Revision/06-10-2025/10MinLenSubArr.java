/*
10. Minimum Size Subarray with Sum ≥ Target
Example: arr = [2,3,1,2,4,3], target = 7 → Length: 2 ([4,3])
*/
class MinLenSubArr {
    public static void main(String args[]) {
        int a[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int n = a.length;
        int minLen = Integer.MAX_VALUE;

        // Try every starting point
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // Add elements until sum >= target
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum >= target) {
                    int len = j - i + 1;
                    if (len < minLen)
                        minLen = len;
                    break; // stop expanding this window
                }
            }
        }

        if (minLen == Integer.MAX_VALUE)
            System.out.println("No subarray found");
        else
            System.out.println("Minimum subarray length: " + minLen);
    }
}
