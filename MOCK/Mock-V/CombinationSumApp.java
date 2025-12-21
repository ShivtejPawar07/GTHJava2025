/*Q3. Given an array of distinct integers candidates and a target integer target, return a list of all unique 
combinations of candidates where the chosen numbers sum to target. You may return the combinations 
in any order. 
The same number may be chosen from candidates an unlimited number of times. Two combinations are 
unique if the frequency of at least one of the chosen numbers is different.  
 
The test cases are generated such that the number of unique combinations that sum up to target is less 
than 150 combinations for the given input.  
Example 1: Input: candidates = [2,3,6,7], target = 7  Explanation: Output: [[2,2,3],[7]]
*/

class CombinationSumApp {

    public static void main(String[] x) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        int[] temp = new int[100];  // to store combination
        findCombination(candidates, target, 0, temp, 0);
    }

    static void findCombination(int[] a, int target, int start, int[] temp, int idx) {

        // base case
        if (target == 0) {
            for (int i = 0; i < idx; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
            return;
        }

        if (target < 0)
            return;

        for (int i = start; i < a.length; i++) {

            temp[idx] = a[i];   // choose
            findCombination(a, target - a[i], i, temp, idx + 1); // reuse allowed
        }
    }
}
