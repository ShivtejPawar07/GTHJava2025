/*Q3. Given an integer array, find the next greater element for each element using a stack. 
  If no greater element exists, print -1 for that position. 
Example: 
 Input: {4, 5, 2, 25} 
 Output: {5, 25, 25, -1}*/
import java.util.Stack;

class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element
            nge[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element
            stack.push(arr[i]);
        }

        // Print output
        for (int x : nge) {
            System.out.print(x + " ");
        }
    }
}
